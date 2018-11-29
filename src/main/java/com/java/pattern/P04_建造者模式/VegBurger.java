package com.java.pattern.P04_建造者模式;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 15.6f;
	}

}
