package com.java.pattern.P02_抽象工厂模式;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color red = colorFactory.getColor("red");
		Color blue = colorFactory.getColor("blue");
		red.fill();
		blue.fill();

		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape circle = shapeFactory.getShape("circle");
		Shape square = shapeFactory.getShape("square");
		circle.draw();
		square.draw();
	}
}
