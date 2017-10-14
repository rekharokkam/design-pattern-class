package com.learning.design.decorator.ingredient;

public class TeaBag extends Ingredient
{
	private static final String NAME = "Coffee";
	private static final double QUANTITY = 1;
	private static final double MSRP = 100.00;

	public TeaBag (){
		super.setQuantity(QUANTITY);
	}
	
	public TeaBag(double quantity)
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
