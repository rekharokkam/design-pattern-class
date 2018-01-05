package com.learning.design.decorator.condiment;

public class TeaBag extends DecoratorCondiment
{
	private static final String DESC = "TeaBag";

	public TeaBag (){
	}
	

	@Override
	public double getCost () {
		return getBevarage().getCost() + 1.15;
	}
	
	@Override
	public String getDescription (){
		return getBevarage().getDescription() + ", " + DESC;
	}
}
