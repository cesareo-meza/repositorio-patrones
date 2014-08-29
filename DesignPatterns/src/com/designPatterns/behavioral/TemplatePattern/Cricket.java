package com.designPatterns.behavioral.TemplatePattern;

public class Cricket extends Game
{

	@Override
	void initialize() {
		System.out.println("Cricket Game initialized! start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game started. Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game finished!");
	}	
}
