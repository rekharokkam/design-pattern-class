package com.learning.designing.strategy;

public abstract class Duck
{
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public void swim (){
		System.out.println(this.getClass().getName() + " : Duck is swiming / floating");
	}
	
	public abstract void display ();
	
	public void performFly (){
		flyBehavior.fly();
	}
	
	public void performQuack (){
		quackBehavior.quack();
	}
	
	public void setFlyBehavior (FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior (QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
	
}
