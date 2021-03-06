package com.java.pattern.P02_抽象工厂模式;

public abstract class AbstractFactory {
	public abstract Color getColor(String colorType);

	public abstract Shape getShape(String shapeType);
}
