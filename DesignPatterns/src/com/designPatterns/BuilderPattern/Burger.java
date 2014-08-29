package com.designPatterns.BuilderPattern;

public abstract class Burger implements Item
{
	@Override
	public Packing packing()
	{
		return new Wrapper();
	}
	
	@Override
	public abstract float price(); 
}