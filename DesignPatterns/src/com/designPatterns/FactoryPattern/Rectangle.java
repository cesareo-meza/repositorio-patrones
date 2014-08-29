package com.designPatterns.FactoryPattern;

import com.designPatterns.FactoryPattern.Shape;

public class Rectangle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Inside Rectangle::draw() method.");		
	}
}