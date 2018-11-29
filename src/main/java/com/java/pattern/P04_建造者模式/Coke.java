package com.java.pattern.P04_建造者模式;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 6.5f;
	}

}
