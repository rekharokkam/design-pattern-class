package com.learning.design.decorator.bevarage;

import java.util.ArrayList;
import java.util.List;

import com.learning.design.decorator.ingredient.Ingredient;
import com.learning.design.decorator.ingredient.Mocha;

public class MochaDarkRoast extends Bevarage
{
	private List<Ingredient> mochaDarkRoastIngredients = new ArrayList<>();
	
	private DarkRoast darkRoast = new DarkRoast();
	
	public MochaDarkRoast (){
		
		mochaDarkRoastIngredients.add(new Mocha());
		
		mochaDarkRoastIngredients.addAll(darkRoast.getIngredients());
		
		super.setIngredients(mochaDarkRoastIngredients);
	}
}
