package com.learning.design.decorator.bevarage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.learning.design.decorator.ingredient.Coffee;
import com.learning.design.decorator.ingredient.Ingredient;
import com.learning.design.decorator.ingredient.Milk;

public class DarkRoast extends Bevarage
{
	private List<Ingredient> darkRoastIngredients = new ArrayList<>(Arrays.asList(new Milk(), new Coffee()));
	
	public DarkRoast()
	{
		super.setIngredients(darkRoastIngredients);
	}
}
