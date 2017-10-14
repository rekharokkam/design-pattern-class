package com.learning.design.decorator.bevarage;

import java.util.ArrayList;
import java.util.List;

import com.learning.design.decorator.ingredient.Ingredient;

public abstract class Bevarage
{
	private List<Ingredient> ingredients = new ArrayList<>();
	
	public List<Ingredient> getIngredients (){
		return ingredients;
	}
	
	protected void setIngredients (List<Ingredient> ingredients){
		this.ingredients = ingredients;
	}
	
	public double getCost (){
		return getIngredients().stream().mapToDouble(Ingredient::getCost).sum();
	}
}
