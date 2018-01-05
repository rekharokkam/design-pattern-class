package com.learning.design.decorator.condiment;

public class Sugar extends DecoratorCondiment
{
	private static final String DESC = "Sugar";

	@Override
	public double getCost () {
		return getBevarage().getCost() + .10;
	}
	
	@Override
	public String getDescription (){
		return getBevarage().getDescription() + ", " + DESC;
	}
}
