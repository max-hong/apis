package com.java.pattern.P02_抽象工厂模式;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if ("red".equalsIgnoreCase(colorType)) {
			return new Red();
		} else if ("blue".equalsIgnoreCase(colorType)) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
