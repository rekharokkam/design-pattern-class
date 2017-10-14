package com.learning.design.decorator.ingredient;

public class SoyMilk extends Ingredient
{
	private static final String NAME = "SoyMilk";
	private static final double QUANTITY = 1;
	private static final double MSRP = 50.00;

	public SoyMilk (){
		super.setQuantity(QUANTITY);
	}
	
	public SoyMilk(double quantity)
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
