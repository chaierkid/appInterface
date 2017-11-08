/*
 * OpenClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: http://www.openclinica.org/license
 * copyright 2003-2005 Akaza Research
 */
package com.dyjs.tools.validation;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.servlet.http.HttpServletRequest;


public class Validator {

    public static final int NO_BLANKS = 1;//非空
    public static final int IS_A_NUMBER = 2;//是数字
    public static final int IS_IN_RANGE = 3;//范围内
    public static final int IS_A_EMAIL = 6;//邮箱
    public static final int LENGTH_NUMERIC_COMPARISON = 7;//长度计算
    public static final int IS_AN_INTEGER = 10;//是整形
    public static final int IS_A_PHONE_NUMBER = 20;//是手机号
    
    //操作符
    public static final int NUMBER_OPERATOR_EQUALS=101;
    public static final int NUMBER_OPERATOR_NOT_EQUALS=102;
    public static final int NUMBER_OPERATOR_GREATER_THAN=103;
    public static final int NUMBER_OPERATOR_GREATER_THAN_OR_EQUAL_TO=104;
    public static final int NUMBER_OPERATOR_LESS_THAN=105;
    public static final int NUMBER_OPERATOR_LESS_THAN_OR_EQUAL_TO=106;

    protected HashMap<String,Integer> errors;
    protected HttpServletRequest request;
    
    public static final ValidatorRegularExpression EMAIL = new ValidatorRegularExpression("username@institution.domain", ".+@.+\\..*");

    public static ValidatorRegularExpression getPhoneRegEx() {
        return new ValidatorRegularExpression("12345678901", "^[1][3,4,5,8][0-9]{9}$");
    }

    
    public Validator(HttpServletRequest req)
    {
    	this.request=req;
    }
    /**
     * 验证: IS_A_NUMBER,IS_A_EMAIL, IS_A_PHONE_NUMBER,
     */
    public void validation(String fieldName, int type) {
        Validation v = new Validation(type);
        validate(fieldName, v);
    }

    /**
     * 验证范围
     */
    public void validationRange(String fieldName, int type, int start, int end) {

        Validation v = new Validation(type);
        v.addArgument(start);
        v.addArgument(end);

        validate(fieldName, v);
    }
    
    public void validationOperator(String fieldName, int type, int operator, int compareTo) {
        // TODO: assert type = COMPARE_TO_STATIC_VALUE or
        // LENGHT_NUMERIC_COMPARISON

        Validation v = new Validation(type);
        v.addArgument(operator);
        v.addArgument(compareTo);

        validate(fieldName, v);
    }

    
    
    protected String getFieldValue(String fieldName) {
        return request.getParameter(fieldName) == null ? request.getAttribute(fieldName) == null ? null : request.getAttribute(fieldName).toString() : request
                .getParameter(fieldName);
    }
    
    protected HashMap<String,Integer> validate(String fieldName, Validation v) {
        switch (v.getType()) {
        case NO_BLANKS://空
            if (isBlank(fieldName)) {
                addError(fieldName, v);
            }
            break;
        case IS_A_NUMBER://是数字
            if (!isNumber(fieldName)) {
                addError(fieldName, v);
            }
            break;
        case IS_IN_RANGE://范围
            float lowerBound = v.getFloat(0);
            float upperBound = v.getFloat(1);

            if (!isInRange(fieldName, lowerBound, upperBound)) {
                addError(fieldName, v);
            }
            break;
        case IS_A_EMAIL:
            if (!isEmail(fieldName)) {
                addError(fieldName, v);
            }
            break;
        case IS_A_PHONE_NUMBER:
            if (!isPhoneNumber(fieldName)) {
                addError(fieldName, v);
            }
            break;
        case IS_AN_INTEGER:
            if (!isInteger(fieldName)) {
                addError(fieldName, v);
            }
            break;
        case LENGTH_NUMERIC_COMPARISON:
        	int operator2 = v.getInt(0);
        	int compareTo2 = v.getInt(1);

            if (!lengthComparesToStaticValue(fieldName, operator2, compareTo2)) {
                addError(fieldName, v);
            }
            break;
     }
        return errors;
    }


    protected void addError(String fieldName, Validation v) {

        int errorMessage = 1;


            switch (v.getType()) {
            case NO_BLANKS://空
                errorMessage = 600;
                break;
            case IS_A_NUMBER://是数字
                errorMessage = 601;
                break;
            case IS_IN_RANGE://范围
                errorMessage =602;
                break;
            case IS_A_EMAIL:
                errorMessage = 603;
                break;
            case IS_A_PHONE_NUMBER:
                errorMessage = 604;
                break;
            case IS_AN_INTEGER:
                errorMessage = 605;
                break;
            case LENGTH_NUMERIC_COMPARISON:
                errorMessage =606;
                break;
        }
        // logger.info("<<<error added: "+errorMessage+" to "+fieldName);
        addError(fieldName, errorMessage);
    }


    protected void addError(String fieldName, int errorMessage) {
        Validator.addError(errors, fieldName, errorMessage);
    }
    

    public static void addError(HashMap<String,Integer> existingErrors, String fieldName, int errorMessage) {

        existingErrors.put(fieldName, errorMessage);
        return;
    }
    
    
    
    /**
     * 空
     * @param fieldName
     * @return
     */
    protected boolean isBlank(String fieldName) {
        String fieldValue = getFieldValue(fieldName);

        if (fieldValue == null) {
            return true;
        }

        if (fieldValue.trim().equals("")) {
            return true;
        }

        return false;
    }
    
    
    /**
     * 是数字
     * @param fieldName
     * @return
     */
    protected boolean isNumber(String fieldName) {
        String fieldValue = getFieldValue(fieldName);

        if (fieldValue == null) {
            return false;
        }
        // Excepts the blank Mantis Issue: 7703.
        if (fieldValue.equals("")) {
            return true;
        }
        try {
            Float.parseFloat(fieldValue);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
    
    
    /**
     * 范围
     * @param fieldName
     * @param lowerBound
     * @param upperBound
     * @return
     */
    protected boolean isInRange(String fieldName, float lowerBound, float upperBound) {
        String fieldValue = getFieldValue(fieldName);

        if (fieldValue == null) {
            return false;
        }

        try {
            float i = Float.parseFloat(fieldValue);

            if (i >= lowerBound && i <= upperBound) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

        return false;
    }
    

    /**
     * 是整形
     * @param fieldName
     * @return
     */
    protected boolean isInteger(String fieldName) {
        String fieldValue = getFieldValue(fieldName);

        if (fieldValue == null) {
            return false;
        }
        // Excepts the blank Mantis Issue: 7703.
        if (fieldValue.equals("")) {
            return true;
        }

        try {
            Integer.parseInt(fieldValue);
        } catch (Exception e) {
            return false;
        }

        return true;
    }



    protected boolean isEmail(String fieldName) {
        return matchesRegex(fieldName, EMAIL);
    }

    protected boolean isPhoneNumber(String fieldName) {
        return matchesRegex(fieldName, getPhoneRegEx());
    }

    protected boolean lengthComparesToStaticValue(String fieldName, int operator, int compareTo) {
        String fieldValue = getFieldValue(fieldName);

        if (fieldValue == null) {
            return false;
        }

        try {
            int length = fieldValue.length();
            return intComparesToStaticValue(length, operator, compareTo);
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * 大于等于小于
     * @param i
     * @param operator
     * @param compareTo
     * @return
     */
    protected boolean intComparesToStaticValue(int i, int operator, int compareTo) {
        boolean compares = false;

        if (operator==NUMBER_OPERATOR_EQUALS) {
            compares = i == compareTo;
        } else if (operator==NUMBER_OPERATOR_NOT_EQUALS) {
            compares = i != compareTo;
        } else if (operator==NUMBER_OPERATOR_GREATER_THAN) {
            compares = i > compareTo;
        } else if (operator==NUMBER_OPERATOR_GREATER_THAN_OR_EQUAL_TO) {
            compares = i >= compareTo;
        } else if (operator==NUMBER_OPERATOR_LESS_THAN) {
            compares = i < compareTo;
        } else if (operator==NUMBER_OPERATOR_LESS_THAN_OR_EQUAL_TO) {
            compares = i <= compareTo;
        }

        return compares;
    }

    
    protected boolean matchesRegex(String fieldName, String regex) {
        ValidatorRegularExpression vre = new ValidatorRegularExpression(regex, regex);
        return matchesRegex(fieldName, vre);
    }

    protected boolean matchesRegex(String fieldName, ValidatorRegularExpression re) {
        String fieldValue = getFieldValue(fieldName);

        if (fieldValue == null) {
            return false;
        }

        Pattern p = null;
        try {
            p = Pattern.compile(re.getRegularExpression());
        } catch (PatternSyntaxException pse) {
            return false;
        }
        Matcher m = p.matcher(fieldValue);

        if (m.matches()) {
            return true;
        }

        return false;
    }

}
