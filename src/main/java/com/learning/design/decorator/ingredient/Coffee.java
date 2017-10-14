package com.learning.design.decorator.ingredient;

public class Coffee extends Ingredient
{
	private static final String NAME = "TeaBag";
	private static final double QUANTITY = 1;
	private static final double MSRP = 5.00;

	public Coffee (){
		super.setQuantity(QUANTITY);
	}
	
	public Coffee(double quantity)
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
