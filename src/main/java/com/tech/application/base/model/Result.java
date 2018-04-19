package com.tech.application.base.model;

import java.io.Serializable;

public class Result<T> implements Serializable{
	
	// 是否成功
	private String success = "";
	
	// 数据
	private T data = null;
	
	// 错误编码
	private String errorCode = "";
	
	// 错误描述
	private String errorMsg = "";

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
