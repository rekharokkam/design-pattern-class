package com.learning.design.decorator.ingredient;

public class Milk extends Ingredient
{
	private static final String NAME = "Milk";
	private static final double QUANTITY = 1;
	private static final double MSRP = 10.00;

	public Milk (){
		super.setQuantity(QUANTITY);
	}
	
	public Milk(double quantity)
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
