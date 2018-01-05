package com.learning.design.decorator.condiment;

public class Whip extends DecoratorCondiment
{
	private static final String DESC = "Whip";

	public double getCost () {
		return getBevarage().getCost() + 5.0;
	}
	
	@Override
	public String getDescription (){
		return getBevarage().getDescription() + ", " + DESC;
	}
}
