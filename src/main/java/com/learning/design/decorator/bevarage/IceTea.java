package com.learning.design.decorator.bevarage;

//import java.util.stream.Collectors;

import com.learning.design.decorator.condiment.DecoratorCondiment;
import com.learning.design.decorator.condiment.Ice;
import com.learning.design.decorator.condiment.Milk;
import com.learning.design.decorator.condiment.Sugar;
import com.learning.design.decorator.condiment.TeaBag;

public class IceTea implements Bevarage
{
	private static final String DESC = "IceTea";
	
	private DecoratorCondiment milk = new Milk ();
	private DecoratorCondiment teaBag = new TeaBag ();
	private DecoratorCondiment ice = new Ice ();
	private DecoratorCondiment sugar = new Sugar ();

	
	public IceTea()
	{
		milk.addBevarage(teaBag);
		teaBag.addBevarage(sugar);
		sugar.addBevarage(ice);
	}
	
	@Override
	public double getCost () {
//		return getCondiments().stream().mapToDouble(Bevarage::getCost).sum();
		return milk.getCost();
	}
	
	@Override
	public String getDescription () {
//		return DESC + " : " + getCondiments().stream().map(Bevarage::getDescription).collect(Collectors.joining(", "));
		return milk.getDescription();
	}
}
