package com.learning.design.decorator.bevarage;

public class DummyBevarage implements Bevarage
{
	@Override
	public double getCost()
	{
		return 0;
	}

	@Override
	public String getDescription()
	{
		return "";
	}

}
