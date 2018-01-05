package com.learning.design.decorator.bevarage;

//import java.util.stream.Collectors;

import com.learning.design.decorator.condiment.DecoratorCondiment;
import com.learning.design.decorator.condiment.Mocha;

public class MochaDarkRoast implements Bevarage
{
	private static final String DESC = "MochaDarkRoast";
	
	private DecoratorCondiment mocha = new Mocha ();
	
	private DarkRoast darkRoast = new DarkRoast();
	
	public MochaDarkRoast (){
		mocha.addBevarage(darkRoast);
	}
	
	@Override
	public double getCost (){
		return mocha.getCost();
	}
	
	@Override
	public String getDescription (){
//		return DESC + " : " + mocha.getCondiments().stream().map(Bevarage::getDescription).collect(Collectors.joining(", "));
		return DESC + " : " + mocha.getDescription();
	}
}
