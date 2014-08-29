package com.designPatterns.behavioral.CommandPattern;

public class SellStock implements Order
{
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	
	public void execute()
	{
		abcStock.sell();
	}
}