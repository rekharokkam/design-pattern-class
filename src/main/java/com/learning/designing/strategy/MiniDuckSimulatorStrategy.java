package com.learning.designing.strategy;

public class MiniDuckSimulatorStrategy
{
	public static void main(String[] args)
	{
//		Duck mallard = new MallardDuck();
//		mallard.performFly();
//		mallard.performQuack();
		
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered()); //After batteries are added to the Duck
		modelDuck.performFly();
	}
}
