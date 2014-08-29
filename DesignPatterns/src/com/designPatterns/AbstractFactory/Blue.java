package com.designPatterns.AbstractFactory;

import com.designPatterns.AbstractFactory.Color;

public class Blue implements Color
{
	@Override
	public void fill()
	{
		System.out.println("Inside Blue::fill method.");
	}
}