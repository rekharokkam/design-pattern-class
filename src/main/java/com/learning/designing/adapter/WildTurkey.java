package com.learning.designing.adapter;

public class WildTurkey implements Turkey
{
	public void gobble()
	{
		System.out.println("gobble gobble");
	}

	public void fly()
	{
		System.out.println("Flying short distances");
	}
}
