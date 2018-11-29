package com.java.pattern.P04_建造者模式.me;

public class TaoCan {
	private Food food;
	private Drink drink;

	public TaoCan() {
	}

	public TaoCan(Food food, Drink drink) {
		this.food = food;
		this.drink = drink;
	}

	public void show() {
		food.show();
		drink.show();
	}
}
