package com.learning.design.decorator.ingredient;

public class Mocha extends Ingredient
{
	private static final String NAME = "Mocha";
	private static final double QUANTITY = 100;
	private static final double MSRP = 25.00;

	public Mocha (){
		super.setQuantity(QUANTITY);
	}
	
	public Mocha(double quantity)
	{
		super.setQuantity(quantity);
	}
	
	@Override
	public double getMsrp()
	{
		return MSRP;
	}

	@Override
	public String getIngredientName (){
		return NAME;
	}
}
