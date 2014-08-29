package com.designPatterns.behavioral.MediatorPatternWiki;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediatorDemo extends JFrame implements ActionListener
{
	IMediator mediator = new Mediator();
	
	MediatorDemo()
	{
		JPanel panel = new JPanel();
		panel.add(new BtnView(this, mediator));
		panel.add(new BtnBook(this, mediator));
		panel.add(new BtnSearch(this, mediator));
		getContentPane().add(new LblDisplay(mediator), "North");
		getContentPane().add(panel, "South");
		setSize(400, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent actionEvent)
	{
		Command command = (Command)actionEvent.getSource();
		command.execute();
	}
	
	public static void main(String[] args)
	{
		new MediatorDemo();
	}
}