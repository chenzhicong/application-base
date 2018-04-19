package com.tech.application.base.exception;

import com.tech.application.base.model.ResultErrorCode;

/**
 * 业务逻辑异常
 * 
 * @author chenzhicong
 */
public class ServiceException extends RuntimeException {
	
	private String code;
	
	private String message;
	
	public ServiceException(String message) {
		super(message);
		this.code = ResultErrorCode.SERVICE_ERROR.getCode();
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		this.code = ResultErrorCode.SERVICE_ERROR.getCode();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
