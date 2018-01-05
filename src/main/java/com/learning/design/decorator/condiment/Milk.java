package com.learning.design.decorator.condiment;

public class Milk extends DecoratorCondiment
{
	private static final String DESC = "Milk";

	@Override
	public double getCost () {
		return getBevarage().getCost() + 0.75;
	}
	
	@Override
	public String getDescription (){
		
		return getBevarage().getDescription() + ", " + DESC;
	}
}
