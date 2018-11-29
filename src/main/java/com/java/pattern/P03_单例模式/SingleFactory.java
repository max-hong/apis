package com.java.pattern.P03_单例模式;

public class SingleFactory {
	/** 懒汉式 **/
	/*
	 * private static Single single;
	 * 
	 * public SingleFactory(){ }
	 * 
	 * public static synchronized Single getInstance() { if (null == single) {
	 * single = new Single(); } return single; }
	 */

	/** 饿汉式 **/
	private static Single single;

	public SingleFactory() {
		single = new Single();
	}

	public static synchronized Single getInstance() {
		if (null == single) {
			single = new Single();
		}
		return single;
	}
}
