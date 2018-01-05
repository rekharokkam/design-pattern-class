package com.learning.design.decorator.bevarage;

//import java.util.stream.Collectors;

import com.learning.design.decorator.condiment.DecoratorCondiment;
import com.learning.design.decorator.condiment.Whip;

public class WhipMochaDarkRoast implements Bevarage
{
	private static final String DESC = "WhipMochaDarkRoast";
	private DecoratorCondiment whip = new Whip();
	
	private Bevarage mochaDarkRoast = new MochaDarkRoast();
	
	public WhipMochaDarkRoast (){
		whip.addBevarage(mochaDarkRoast);
	}
	
	@Override
	public double getCost () {
		return whip.getCost();
	}
	
	@Override
	public String getDescription () {
//		return DESC + " : " + getCondiments().stream().map(Bevarage::getDescription).collect(Collectors.joining(", "));
		return whip.getDescription();
	}
}
