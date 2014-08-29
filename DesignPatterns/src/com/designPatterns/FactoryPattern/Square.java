package com.designPatterns.FactoryPattern;

import com.designPatterns.FactoryPattern.Shape;

public class Square implements Shape
{
	@Override
	public void draw()
	{		
		System.out.println("Inside Square::draw() method.");
	}
}