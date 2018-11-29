package com.java.pattern.P01_工厂模式;

public class ShapeFactory {
	private Shape shape;

	public Shape getShape(String shapeType) {
		if ("circle".equalsIgnoreCase(shapeType)) {
			return shape = new Circle();
		} else if ("square".equalsIgnoreCase(shapeType)) {
			return shape = new Square();
		}
		return shape;
	}
}
