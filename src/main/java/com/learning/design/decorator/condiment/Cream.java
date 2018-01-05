package com.learning.design.decorator.condiment;

public class Cream extends DecoratorCondiment
{
	private static final String DESC = "Cream";

	public Cream (){
	}

	@Override
	public double getCost () {
		return getBevarage().getCost() + 1.0;
	}
	
	@Override
	public String getDescription (){
		return getBevarage().getDescription() + ", " + DESC;
	}
}
