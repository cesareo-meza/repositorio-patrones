package com.designPatterns.behavioral.MediatorPatternWiki;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class BtnBook extends JButton implements Command
{
	IMediator mediator;
	
	BtnBook(ActionListener actionListener, IMediator mediator)
	{
		super("Book");
		addActionListener(actionListener);
		this.mediator = mediator;
		this.mediator.registerBook(this);
	}
	
	public void execute()
	{
		mediator.book();
	}
}