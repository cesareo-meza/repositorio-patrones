package com.designPatterns.behavioral.MediatorPatternWiki;

import javax.swing.JLabel;
import java.awt.Font;

public class LblDisplay extends JLabel
{
	IMediator mediator;
	
	LblDisplay(IMediator mediator)
	{
		super("Just start...");
		this.mediator = mediator;
		mediator.registerDisplay(this);
		setFont(new Font("Arial", Font.BOLD, 24));
	}
}