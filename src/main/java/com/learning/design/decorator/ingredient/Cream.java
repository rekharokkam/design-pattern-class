package com.learning.design.decorator.ingredient;

public class Cream extends Ingredient
{
	private static final String NAME = "Cream";
	private static final double QUANTITY = 4;
	private static final double MSRP = 2.00;

	public Cream (){
		super.setQuantity(QUANTITY);
	}
	
	public Cream(double quantity)
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
