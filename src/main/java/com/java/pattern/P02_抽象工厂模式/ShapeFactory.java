package com.java.pattern.P02_抽象工厂模式;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if ("circle".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("square".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
