package _3_decorator.codimentDecorator;

import _3_decorator.Beverage;

public class Milk extends CondimentDecoration {
	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + "Milk add";
	}

	public float getCost() {
		return beverage.getCost() + 10;
	}
}
