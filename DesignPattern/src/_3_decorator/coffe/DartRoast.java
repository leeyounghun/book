package _3_decorator.coffe;

import _3_decorator.Beverage;

public class DartRoast extends Beverage{

	public DartRoast(){
		super();
		super.setCost(300);
		super.setDescription("this is DartRoast");
	}

	public DartRoast(float cost){
		super();
		super.setCost(cost);
	}
}
