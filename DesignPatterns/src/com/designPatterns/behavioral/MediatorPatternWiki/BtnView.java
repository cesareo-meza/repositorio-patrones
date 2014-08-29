package com.designPatterns.behavioral.MediatorPatternWiki;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class BtnView extends JButton implements Command
{
	IMediator mediator;
	
	BtnView(ActionListener actionListener, IMediator mediator)
	{
		super("View");
		addActionListener(actionListener);
		this.mediator = mediator;
		this.mediator.registerView(this);
	}
	
	public void execute()
	{
		mediator.view();
	}
}