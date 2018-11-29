package com.java.pattern.P02_抽象工厂模式;

/**
 * 圆
 * 
 * @author Administrator
 * 
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square.draw() is running...");
	}

}
