package com.designPatterns.behavioral.MediatorPatternWiki;

public interface IMediator
{
	void book();
	void view();
	void search();
	void registerView(BtnView view);
	void registerSearch(BtnSearch search);
	void registerBook(BtnBook book);
	void registerDisplay(LblDisplay display);
}