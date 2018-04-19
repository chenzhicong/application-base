package com.tech.application.base.controller;

import com.tech.application.base.model.Result;
import com.tech.application.base.model.ResultSuccess;

public abstract class BaseController {
	
	public <T> Result<T> buildSuccessResult(T data) {
		
		Result<T> result = new Result<T>();
		result.setSuccess(ResultSuccess.SUCCESS.getCode());
		result.setData(data);
		result.setErrorCode("");
		result.setErrorMsg("");
		
		return result;
	}
	
	public Result<Object> buildFailureResult(String errorCode, String errorMsg) {
		
		Result<Object> result = new Result<Object>();
		result.setSuccess(ResultSuccess.SUCCESS.getCode());
		result.setData(null);
		result.setErrorCode(errorCode);
		result.setErrorMsg(errorMsg);
		
		return result;
	}
}
