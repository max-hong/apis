package com.java.pattern.P03_单例模式;

public class SingleDemo {
	public static void main(String[] args) {
		SingleFactory factory = new SingleFactory();
		Single single1 = factory.getInstance();
		Single single2 = factory.getInstance();
		System.out.println(single1 == single2);
	}
}
