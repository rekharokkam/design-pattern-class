package com.learning.design.decorator.client;

import com.learning.design.decorator.bevarage.Bevarage;
import com.learning.design.decorator.bevarage.DarkRoast;
import com.learning.design.decorator.bevarage.MochaDarkRoast;
import com.learning.design.decorator.bevarage.WhipMochaDarkRoast;
import com.learning.design.decorator.condiment.DecoratorCondiment;
import com.learning.design.decorator.condiment.Mocha;
import com.learning.design.decorator.condiment.Whip;

public class Customer
{
	public static void main(String[] args)
	{
		//First Customer ordered DarkRoast
//		Bevarage darkRoast = new DarkRoast();
//		System.out.println("First Order : " + darkRoast.getDescription() + " :: Cost : " + darkRoast.getCost());
		
		//Second Customer Ordered WhipMocha
//		Bevarage mochaDarkRoast = new MochaDarkRoast();
//		System.out.println("Second Order : " + mochaDarkRoast.getDescription() + " :: Cost : " + mochaDarkRoast.getCost());
//
		//Third Customer ordered WhipMochaDarkRoast + mocha + whip as an additional Condiments 
		Bevarage whipMochaDarkRoast2 = new WhipMochaDarkRoast();
		
		DecoratorCondiment mocha = new Mocha();
		mocha.addBevarage(whipMochaDarkRoast2);
		
		DecoratorCondiment whip = new Whip ();
		whip.addBevarage(mocha);
		
		System.out.println("Third Order : " + whip.getDescription() + " :: Cost : " + whip.getCost());
	}
}
