package com.designPatterns.behavioral.VisitorPattern;

public interface ComputerPart
{
	public void accept(ComputerPartVisitor computerPartVisitor);
}