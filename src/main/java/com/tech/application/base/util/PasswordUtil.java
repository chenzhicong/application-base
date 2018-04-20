package com.tech.application.base.util;

public class PasswordUtil {
	
	public static String encrypt(String data) {
		
		String encryptData = EncryptUtil.encryptByMD5(data);
		encryptData = EncryptUtil.encryptBySHA1(encryptData);
		
		return encryptData;
	}
	
}
