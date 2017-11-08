package com.dyjs.vo;


/**
 * 返回结果
 * @author Dyan
 *
 */
public class Result {
	
	private int stateCode;
    
    private Object object;
    
    private String message;
    
    
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
  
}
