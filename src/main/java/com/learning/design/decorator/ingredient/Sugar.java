package com.learning.design.decorator.ingredient;

public class Sugar extends Ingredient
{
	private static final String NAME = "Sugar";
	private static final double QUANTITY = 10;
	private static final double MSRP = 25.00;

	public Sugar (){
		super.setQuantity(QUANTITY);
	}
	
	public Sugar(double quantity)
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
