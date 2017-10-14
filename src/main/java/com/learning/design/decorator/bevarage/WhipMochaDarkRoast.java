package com.learning.design.decorator.bevarage;

import java.util.ArrayList;
import java.util.List;

import com.learning.design.decorator.ingredient.Ingredient;
import com.learning.design.decorator.ingredient.Whip;

public class WhipMochaDarkRoast extends Bevarage
{
	private List<Ingredient> whipMochaDarkRoast = new ArrayList<>(); 
			
	private MochaDarkRoast mochaDarkRoast = new MochaDarkRoast();
	
	public WhipMochaDarkRoast (){
		
		whipMochaDarkRoast.add(new Whip ());
		
		whipMochaDarkRoast.addAll(mochaDarkRoast.getIngredients());
		
		super.setIngredients(whipMochaDarkRoast);
	}
}
