package com.java.pattern.P02_抽象工厂模式;

/**
 * 圆
 * 
 * @author Administrator
 * 
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle.draw() is running...");
	}

}
