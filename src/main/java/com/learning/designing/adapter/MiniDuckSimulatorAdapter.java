package com.learning.designing.adapter;

public class MiniDuckSimulatorAdapter
{
	public static void main(String[] args)
	{
		System.out.println("Invoking Duck directly");
		testDuck(new MallardDuck());
		
		//Need to use Turkey in this simulator as Duck
		System.out.println("Invoking Turkey through TurkeyAdapter");
		testDuck(new TurkeyAdapter(new WildTurkey()));
		
	}
	
	static void testDuck (Duck duck){
		duck.quack();
		duck.fly();
	}
}
