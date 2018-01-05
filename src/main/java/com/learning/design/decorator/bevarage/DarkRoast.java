package com.learning.design.decorator.bevarage;

//import java.util.stream.Collectors;

import com.learning.design.decorator.condiment.Coffee;
import com.learning.design.decorator.condiment.DecoratorCondiment;
import com.learning.design.decorator.condiment.Milk;

public class DarkRoast implements Bevarage
{
	private static final String DESC = "DarkRoast";
	private DecoratorCondiment milk = new Milk ();
	private DecoratorCondiment coffee = new Coffee ();
	
	public DarkRoast()
	{
//		addCondiments(new Milk(), new Coffee());
		milk.addBevarage(coffee);
	}
	
	@Override
	public double getCost () {
//		return getCondiments().stream().mapToDouble(Bevarage::getCost).sum();
		return milk.getCost();
	}
	
	@Override
	public String getDescription (){ // Decorator behavior
//		return DESC + " : " + getCondiments().stream().map(Bevarage::getDescription).collect(Collectors.joining(", "));
		return DESC + " : " + milk.getDescription();
	}
}
