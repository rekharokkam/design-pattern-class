package com.learning.design.decorator.ingredient;

public class Ice extends Ingredient
{
	private static final String NAME = "Ice";
	private static final double QUANTITY = 5;
	private static final double MSRP = 1.00;

	public Ice (){
		super.setQuantity(QUANTITY);
	}
	
	public Ice(double quantity)
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
