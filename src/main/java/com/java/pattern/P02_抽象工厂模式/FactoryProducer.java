package com.java.pattern.P02_抽象工厂模式;

public abstract class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType) {
		if (factoryType == null) {
			return null;
		}
		if ("COLOR".equalsIgnoreCase(factoryType)) {
			return new ColorFactory();
		} else if ("SHAPE".equalsIgnoreCase(factoryType)) {
			return new ShapeFactory();
		}
		return null;
	}
}
