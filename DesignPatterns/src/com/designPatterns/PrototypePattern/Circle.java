package com.designPatterns.PrototypePattern;

public class Circle extends Shape
{
	public Circle()
	{
		type = "Circle"; 
	}
	
	@Override 
	public void draw()
	{
		System.out.println("Indise Circle::draw method.");
	}
}