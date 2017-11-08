package com.dyjs.tools;


import org.apache.log4j.Logger;

/**
 * @author macq
 * 
 */
public class LogUtil {
	//exception
	public static Logger interfaceExceptionLogger = Logger.getLogger("interfaceexception");
	
	
	public static Logger clientExceptionLogger = Logger.getLogger("clientexception");
	
	/**
	 * @author Dyan
	 * @explain：封装exception日志
	 * @datetime:2017-10-31 11:02
	 * @param log
	 * @return void
	 */
	public static void interfaceException(String log) {
		interfaceExceptionLogger.error(log);
	}
}
