package com.tech.application.base.model;

public enum ResultErrorCode {
	
	UNKNOWN_ERROR("9999", "未知错误"),
	DAO_ERROR("9001", "数据访问错误"),
	SERVICE_ERROR("9002", "业务逻辑验证错误"),
	VALIDATE_ERROR("9003", "参数验证错误"),
	CACHE_ERROR("9004", "缓存访问错误"),
	;
	
	private String code;
	
    private String desc;

    ResultErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
