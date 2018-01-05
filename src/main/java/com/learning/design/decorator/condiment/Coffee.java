package com.learning.design.decorator.condiment;


public class Coffee extends DecoratorCondiment
{
	private static final String DESC = "Coffee";

	public Coffee (){
	}
	
	@Override
	public double getCost (){
		return getBevarage().getCost() + 2.0;
	}
	
	@Override
	public String getDescription (){
		return getBevarage().getDescription() + ", " + DESC;
	}
}
