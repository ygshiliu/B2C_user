package com.wnn.myutils;

public class MyDatasourceSwitch {
	private static ThreadLocal<String> tl = new ThreadLocal<String>();

	public static String getKey() {
		return tl.get();
	}

	public static void setKey(String key) {
		tl.set(key);
	}
	
}
