package com.designPatterns.AbstractFactory;

import com.designPatterns.AbstractFactory.Color;
import com.designPatterns.FactoryPattern.Shape;

public abstract class AbstractFactory
{
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}