package _3_decorator.coffe;

import _3_decorator.Beverage;

public class Decaf extends Beverage{
	public Decaf(){
		super();
		super.setCost(200);
		super.setDescription("this is Decaf");
	}

	public Decaf(float cost){
		super();
		super.setCost(cost);
	}

}
