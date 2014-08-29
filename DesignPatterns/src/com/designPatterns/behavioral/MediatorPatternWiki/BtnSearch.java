package com.designPatterns.behavioral.MediatorPatternWiki;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class BtnSearch extends JButton implements Command
{
	IMediator mediator;
	
	BtnSearch(ActionListener actionListener, IMediator mediator)
	{
		super("Search");
		addActionListener(actionListener);
		this.mediator = mediator;
		this.mediator.registerSearch(this);
	}
	
	public void execute()
	{
		mediator.search();
	}
}