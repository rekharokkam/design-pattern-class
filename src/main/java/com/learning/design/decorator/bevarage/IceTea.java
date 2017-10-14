package com.learning.design.decorator.bevarage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.learning.design.decorator.ingredient.Ice;
import com.learning.design.decorator.ingredient.Ingredient;
import com.learning.design.decorator.ingredient.Milk;
import com.learning.design.decorator.ingredient.Sugar;
import com.learning.design.decorator.ingredient.TeaBag;

public class IceTea extends Bevarage
{
	private List<Ingredient> iceTeaIngredients = new ArrayList<>(Arrays.asList(new Milk(), new Ice(), new TeaBag(), new Sugar()));
	
	public IceTea()
	{
		super.setIngredients(iceTeaIngredients);
	}
}
