package com.designPatterns.behavioral.NullObjectPattern;

public class RealCustomer extends AbstractCustomer
{	
	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() 
	{		
		return false;
	}

	@Override
	public String getName() 
	{
		return this.name;
	}
	
}