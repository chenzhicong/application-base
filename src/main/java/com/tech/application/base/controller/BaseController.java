package com.tech.application.base.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

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
	
	public List<String> getParamList(final String parmaStr, final String separator) {

		if (StringUtils.isNotBlank(parmaStr)) {
			String[] array = parmaStr.split(separator);
			return Arrays.asList(array);
		} else {
			return new ArrayList<String>(0);
		}
	}
}
