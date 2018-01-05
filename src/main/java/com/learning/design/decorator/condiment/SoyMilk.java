package com.learning.design.decorator.condiment;

public class SoyMilk extends DecoratorCondiment
{
	private static final String DESC = "SoyMilk";

	@Override
	public double getCost (){
		return getBevarage().getCost() + 2.50;
	}
	
	@Override
	public String getDescription (){
		return getBevarage().getDescription() + ", " + DESC;
	}
}
