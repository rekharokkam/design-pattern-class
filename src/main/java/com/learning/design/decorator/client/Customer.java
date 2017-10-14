package com.learning.design.decorator.client;

import com.learning.design.decorator.bevarage.Bevarage;
import com.learning.design.decorator.bevarage.DarkRoast;
import com.learning.design.decorator.bevarage.WhipMochaDarkRoast;
import com.learning.design.decorator.ingredient.Mocha;

public class Customer
{
	public static void main(String[] args)
	{
		//First Customer ordered DarkRoast
		System.out.println("First Customer's Order of DarkRoast costs : " + new DarkRoast().getCost());
		
		//Second Customer Ordered WhipMocha
		System.out.println("First Customer's Order of WhipMochaDarkRoast costs : " + new WhipMochaDarkRoast().getCost());

		//Third Customer ordered WhipMocha + Just mocha as an add on
		Bevarage bevarage = new WhipMochaDarkRoast();
		double doubleWhipMochaDarkRoastCost = bevarage.getCost() + (new Mocha(0.5)).getCost();
		System.out.println("Total cost of doubleWhipMochaDarkRoastCost : " + doubleWhipMochaDarkRoastCost);
	}
}
