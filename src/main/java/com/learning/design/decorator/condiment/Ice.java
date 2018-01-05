package com.learning.design.decorator.condiment;

public class Ice extends DecoratorCondiment
{
	private static final String DESC = "Ice";

	public Ice (){
	}
	
	@Override
	public double getCost () {
		return getBevarage().getCost() + 0.25;
	}
	
	
	@Override
	public String getDescription (){
		return getBevarage().getDescription() + ", " + DESC;
	}
}
