package com.tech.application.base.util;

import java.security.MessageDigest;

public class EncryptUtil {

	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
			"e", "f" };

	/**
	 * 定义加密方式
	 */
	private final static String SHA1 = "SHA1";
	private final static String MD5 = "MD5";

	/**
	 * MD5 加密
	 * 
	 * @param data
	 *            需要加密的字符串
	 * @return 加密之后的字符串
	 * @throws Exception
	 */
	public static String encryptByMD5(String data) {
		// 验证传入的字符串
		if (data == null || data.equals("")) {
			return "";
		}
		
		try {
			// 创建具有指定算法名称的信息摘要
			MessageDigest md = MessageDigest.getInstance(MD5);
			// 使用指定的字节数组对摘要进行最后更新
			md.update(data.getBytes("UTF-8"));
			// 完成摘要计算
			byte[] bytes = md.digest();
			// 将得到的字节数组变成字符串返回
			return byteArrayToHexString(bytes);
		} catch(Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		
	}

	/**
	 * SHA1 加密
	 * 
	 * @param data
	 *            需要加密的字符串
	 * @return 加密之后的字符串
	 * @throws Exception
	 */
	public static String encryptBySHA1(String data) {
		// 验证传入的字符串
		if (data == null || data.equals("")) {
			return "";
		}
		try {
			// 创建具有指定算法名称的信息摘要
			MessageDigest md = MessageDigest.getInstance(SHA1);
			// 使用指定的字节数组对摘要进行最后更新
			md.update(data.getBytes("UTF-8"));
			// 完成摘要计算
			byte[] bytes = md.digest();
			// 将得到的字节数组变成字符串返回
			return byteArrayToHexString(bytes);
		} catch(Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	/**
	 * 转换字节数组为16进制字串
	 * 
	 * @param b
	 *            字节数组
	 * @return 16进制字串
	 */
	public static String byteArrayToHexString(byte[] b) {
		StringBuilder resultSb = new StringBuilder();
		for (byte aB : b) {
			resultSb.append(byteToHexString(aB));
		}
		return resultSb.toString();
	}

	/**
	 * 转换byte到16进制
	 * 
	 * @param b
	 *            要转换的byte
	 * @return 16进制格式
	 */
	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0) {
			n = 256 + n;
		}
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}
}
