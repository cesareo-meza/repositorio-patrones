package com.designPatterns.behavioral.VisitorPattern;

public class Keyboard implements ComputerPart
{
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		computerPartVisitor.visit(this);
	}
}