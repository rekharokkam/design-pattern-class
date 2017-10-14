package com.learning.design.decorator.ingredient;

public class Whip extends Ingredient
{
	private static final String NAME = "Whip";
	private static final double QUANTITY = 3;
	private static final double MSRP = 6.00;

	public Whip (){
		super.setQuantity(QUANTITY);
	}
	
	public Whip(double quantity)
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
