package com.learning.design.decorator.ingredient;

public abstract class Ingredient
{
	protected double quantity;
	protected double msrp;

	//This is a calculated value
	public double getCost()
	{
		return getMsrp()/getQuantity();
	}
	
    //available only to children
	protected abstract double getMsrp();
	
	public abstract String getIngredientName();

	public double getQuantity()
	{
		return quantity;
	}

	public void setQuantity(double quantity)
	{
		this.quantity = quantity;
	}
}
