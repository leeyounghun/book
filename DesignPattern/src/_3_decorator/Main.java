package _3_decorator;

import _3_decorator.codimentDecorator.Milk;
import _3_decorator.codimentDecorator.Mocha;
import _3_decorator.coffe.Decaf;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage decaf = new Decaf();

		decaf = new Mocha(decaf);
		decaf = new Mocha(decaf);
		decaf = new Milk(decaf);

		System.out.println(decaf.getCost());
		System.out.println(decaf.getDescription());

	}

}
