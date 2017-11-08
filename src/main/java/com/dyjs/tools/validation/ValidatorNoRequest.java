package com.dyjs.tools.validation;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.commons.lang.StringUtils;

import com.dyjs.tools.exception.ErrorCode;



public class ValidatorNoRequest {

    public static final int NO_BLANKS = 1;//非空
    public static final int IS_A_NUMBER = 2;//是数字
    public static final int IS_IN_RANGE = 3;//范围内
    public static final int IS_A_DATE = 4;//是日期
    public static final int IS_A_EMAIL = 6;//邮箱
    public static final int LENGTH_NUMERIC_COMPARISON = 7;//长度计算
    public static final int IS_AN_INTEGER = 10;//是整形
    public static final int IS_A_PHONE_NUMBER = 20;//是手机号
    public static final int IS_A_TEL_NUMBER = 21;//是座机号
    public static final int IS_A_TELORPHONE_NUMBER=22;
    
    //操作符
    public static final int NUMBER_OPERATOR_EQUALS=101;//等于
    public static final int NUMBER_OPERATOR_NOT_EQUALS=102;//不等于
    public static final int NUMBER_OPERATOR_GREATER_THAN=103;//大于
    public static final int NUMBER_OPERATOR_GREATER_THAN_OR_EQUAL_TO=104;//大于等于
    public static final int NUMBER_OPERATOR_LESS_THAN=105;//小于
    public static final int NUMBER_OPERATOR_LESS_THAN_OR_EQUAL_TO=106;//小于等于

    private HashMap<String,String > errors= new HashMap<String,String >();
    private static final ValidatorRegularExpression EMAIL = new ValidatorRegularExpression("username@institution.domain", ".+@.+\\..*");

    private static ValidatorRegularExpression getPhoneRegEx() {
        return new ValidatorRegularExpression("12345678901", "^[1][3,4,5,7,8][0-9]{9}$");
    }
    private static ValidatorRegularExpression getTelRegEx() {
        return new ValidatorRegularExpression("010-12345678-123123", "^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{1,6}))?$");
    };
    Pattern pdateshort = Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\-\\s]?((((0?[13578])|(1[02]))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\-\\s]?((((0?[13578])|(1[02]))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\-\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))"); 
    Pattern pdatelong =  Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\-\\s]?((((0?[13578])|(1[02]))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\-\\s]?((((0?[13578])|(1[02]))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\-\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\-\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$"); 
	
    public HashMap<String,String > getError()
    {
    	return errors;
    }
    
    /**
     * 验证: IS_A_NUMBER,IS_A_EMAIL, IS_A_PHONE_NUMBER,
     */
    public void validation(String fieldName,String fieldValue, int type) {
        Validation v = new Validation(type);
        validate(fieldName,fieldValue, v);
    }

    /**
     * 验证范围
     * 
     */
    public void validationRange(String fieldName,String fieldValue, int type, int start, int end) {

        Validation v = new Validation(type);
        v.addArgument(start);
        v.addArgument(end);
        validate(fieldName,fieldValue, v);
    }
    
    /**
     * 验证
     * @param fieldValue 需要验证的字符串
     * @param type 验证类型
     * @param operator 长度下限
     * @param compareTo 长度上限
     */
    public void validationOperator(String fieldName,String fieldValue, int type, int operator, int compareTo) {
        // TODO: assert type = COMPARE_TO_STATIC_VALUE or
        // LENGHT_NUMERIC_COMPARISON

        Validation v = new Validation(type);
        v.addArgument(operator);
        v.addArgument(compareTo);
        validate(fieldName,fieldValue, v);
    }

    

    
    private void validate(String fieldName,String fieldValue, Validation v) {
    	 if(StringUtils.isNotEmpty(fieldValue)){

     		fieldValue=fieldValue.replaceAll("&amp;","&"); 

     		fieldValue=fieldValue.replaceAll("&lt;","<"); 

     		fieldValue=fieldValue.replaceAll("&gt;",">"); 

     		fieldValue=fieldValue.replaceAll("&apos;","'");

     		fieldValue=fieldValue.replaceAll("&quot;","\""); 
     }
     
        switch (v.getType()) {
        case NO_BLANKS://空
            if (isBlank(fieldValue)) {
                addError(fieldName,fieldValue, v);
            }
            break;
        case IS_A_NUMBER://是数字
            if (!isNumber(fieldValue)) {
                addError(fieldName,fieldValue, v);
            }
            break;
        case IS_IN_RANGE://范围
            float lowerBound = v.getFloat(0);
            float upperBound = v.getFloat(1);

            if (!isInRange(fieldValue, lowerBound, upperBound)) {
                addError(fieldName,fieldValue, v);
            }
            break;
        case IS_A_DATE://日期
        	if (!isDate(fieldValue)) {
                addError(fieldName,fieldValue, v);
            }
            break;
        case IS_A_EMAIL://邮件
            if (!isEmail(fieldValue)) {
                addError(fieldName,fieldValue, v);
            }
            break;
        case IS_A_PHONE_NUMBER://电话号码
            if (!isPhoneNumber(fieldValue)) {
                addError(fieldName,fieldValue, v);
            }
            break;
        case IS_A_TEL_NUMBER://电话号码
            if (!isTelNumber(fieldValue)) {
                addError(fieldName,fieldValue, v);
            }
            break;
        case IS_A_TELORPHONE_NUMBER://电话号码
            if (!isTelOrPhoneNumber(fieldValue)) {
                addError(fieldName,fieldValue, v);
            }
            break;      
        case IS_AN_INTEGER:
            if (!isInteger(fieldValue)) {
                addError(fieldName,fieldValue, v);
            }
            break;
        case LENGTH_NUMERIC_COMPARISON://长度计算
        	int operator2 = v.getInt(0);
        	int compareTo2 = v.getInt(1);

            if (!lengthComparesToStaticValue(fieldValue, operator2, compareTo2)) {
                addError(fieldName,fieldValue, v);
            }
            break;
     }
    }


    private void addError(String fieldName,String fieldValue, Validation v) {

        String errorMessage = "1";

            switch (v.getType()) {
            case NO_BLANKS://空错误信息
                errorMessage = ErrorCode.VALIDATE_NOTNULL+"."+fieldName.toUpperCase();
                break;
            case IS_A_NUMBER://是数字错误信息
                errorMessage = ErrorCode.VALIDATE_NOTNUMBER+"."+fieldName.toUpperCase();
                break;
            case IS_IN_RANGE://不在范围内错误信息
                errorMessage =ErrorCode.VALIDATE_NOTINRANGE+"."+fieldName.toUpperCase();
                break;
            case IS_A_DATE://是日期错误
                errorMessage =ErrorCode.VALIDATE_DATE+"."+fieldName.toUpperCase();
                break;
            case IS_A_EMAIL://非邮件错误信息
                errorMessage = ErrorCode.VALIDATE_NOTMAIL+"."+fieldName.toUpperCase();
                break;
            case IS_A_PHONE_NUMBER://非电话号码错误信息
                errorMessage = ErrorCode.VALIDATE_NOTPHONE+"."+fieldName.toUpperCase();
                break;
            case IS_A_TEL_NUMBER://非电话号码错误信息
                errorMessage = ErrorCode.VALIDATE_NOTPHONE+"."+fieldName.toUpperCase();
                break;
            case IS_A_TELORPHONE_NUMBER://非电话号码错误信息
                errorMessage = ErrorCode.VALIDATE_NOTPHONE+"."+fieldName.toUpperCase();
                break;
            case IS_AN_INTEGER://非整型错误信息
                errorMessage = ErrorCode.VALIDATE_NOTINTEGER+"."+fieldName.toUpperCase();
                break;
            case LENGTH_NUMERIC_COMPARISON://长度错误信息
                errorMessage =ErrorCode.VALIDATE_LENGERROR+"."+fieldName.toUpperCase();
                break;
        }
        // logger.info("<<<error added: "+errorMessage+" to "+fieldValue);
        addError(errorMessage);
    }


    private void addError(String errorMessage) {
        ValidatorNoRequest.addError(errors, "error", errorMessage);
    }
    

    private static void addError(HashMap<String,String > existingErrors, String fieldName, String errorMessage) {
    	if(existingErrors.isEmpty())
    		existingErrors.put(fieldName, errorMessage);
        return;
    }
    
    
    
    /**
     * 空
     * @param fieldValue
     * @return
     */
    private boolean isBlank(String fieldValue) {

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
     * @param fieldValue
     * @return
     */
    private boolean isNumber(String fieldValue) {

        if (fieldValue == null) {
            return false;
        }
        if (fieldValue.equals("")) {
            return false;
        }
        try {
            Float.parseFloat(fieldValue);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
    
    /**
     * 是日期
     * @param fieldValue
     * @return
     */
    private boolean isDate(String fieldValue) {

        if (fieldValue == null) {
            return false;
        }
        if (fieldValue.equals("")) {
            return false;
        }    
        if(pdateshort.matcher(fieldValue).matches())
        	return true;
        if(pdatelong.matcher(fieldValue).matches())
        	return true;

        return false;
    }
    
    
    /**
     * 范围
     * @param fieldValue
     * @param lowerBound
     * @param upperBound
     * @return
     */
    private boolean isInRange(String fieldValue, float lowerBound, float upperBound) {

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
     * @param fieldValue
     * @return
     */
    private boolean isInteger(String fieldValue) {

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



    private boolean isEmail(String fieldValue) {
        return matchesRegex(fieldValue, EMAIL);
    }

    private boolean isPhoneNumber(String fieldValue) {
        return matchesRegex(fieldValue, getPhoneRegEx());
    }
    private boolean isTelNumber(String fieldValue) {
        return matchesRegex(fieldValue, getTelRegEx());
    }
    private boolean isTelOrPhoneNumber(String fieldValue) {
        return matchesRegex(fieldValue, getPhoneRegEx(),getTelRegEx());
    }

    private boolean lengthComparesToStaticValue(String fieldValue, int operator, int compareTo) {

        if (fieldValue == null) {
        	fieldValue="";
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
    private boolean intComparesToStaticValue(int i, int operator, int compareTo) {
        boolean compares = false;
//        System.out.println(i);
//        System.out.println(compareTo);
//        System.out.println(operator);
//        System.out.println(compares = i == compareTo);
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

    

    private boolean matchesRegex(String fieldValue, ValidatorRegularExpression re) {

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
//        System.out.println(m.matches());
        if (m.matches()) {
            return true;
        }

        return false;
    }
    
    
    private boolean matchesRegex(String fieldValue,ValidatorRegularExpression re, ValidatorRegularExpression re1) {

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
        
        try {
            p = Pattern.compile(re1.getRegularExpression());
        } catch (PatternSyntaxException pse) {
            return false;
        }
        Matcher m1 = p.matcher(fieldValue);
        if (m1.matches()) {
            return true;
        }

        return false;
    }
    

}
