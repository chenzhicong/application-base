package com.tech.application.base.util;

import java.util.UUID;

public class IdUtil {
	
	public static String generateUUID() {
		UUID uuid = UUID.randomUUID();  
        String str = uuid.toString();
        return str.replaceAll("-", "");
	}
}
