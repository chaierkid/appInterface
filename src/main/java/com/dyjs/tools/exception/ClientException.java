package com.dyjs.tools.exception;

import com.dyjs.tools.LogUtil;

public class ClientException  extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -809108898932598281L;

	public ClientException() {
		super();
		LogUtil.clientExceptionLogger.error(this.toString(), this);
	}
	
	public ClientException(String message) {
		super(message);
		LogUtil.clientExceptionLogger.error(this.toString(), this);
	}
	
    public ClientException(String message, Throwable cause) {
        super(message, cause);
        LogUtil.clientExceptionLogger.error(this.toString(), this);
    }

    public ClientException(Throwable cause) {
        super(cause);
        LogUtil.clientExceptionLogger.error(this.toString(), this);
    }
}
