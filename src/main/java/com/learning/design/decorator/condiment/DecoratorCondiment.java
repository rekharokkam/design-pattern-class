package com.learning.design.decorator.condiment;

import com.learning.design.decorator.bevarage.Bevarage;
import com.learning.design.decorator.bevarage.DummyBevarage;

public abstract class DecoratorCondiment implements Bevarage
{
	private Bevarage bevarage = new DummyBevarage();
	
	public void addBevarage (Bevarage bevarage){
		this.bevarage = bevarage;
	}
	
	public Bevarage getBevarage (){
		return bevarage;
	}
}
