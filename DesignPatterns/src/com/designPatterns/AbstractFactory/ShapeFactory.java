package com.designPatterns.AbstractFactory;

import com.designPatterns.AbstractFactory.AbstractFactory;
import com.designPatterns.AbstractFactory.Color;
import com.designPatterns.FactoryPattern.*;

public class ShapeFactory extends AbstractFactory 
{
	@Override
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
		{
			return null;			
		}
		if(shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		return null;
	}
	
	@Override
	public Color getColor(String color)
	{
		return null;
	}
}