package com.learning.design.decorator.condiment;

public class Mocha extends DecoratorCondiment
{
	private static final String DESC = "Mocha";

	@Override
	public double getCost () {
		return getBevarage().getCost() + 3.0;
	}
	
	@Override
	public String getDescription (){
		return getBevarage().getDescription() + ", " + DESC;
	}
}
