package _3_decorator.codimentDecorator;

import _3_decorator.Beverage;

public class Mocha extends CondimentDecoration{
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + " Mocha add ";
	}

	public float getCost() {
		return beverage.getCost() + 1;
	}
}
