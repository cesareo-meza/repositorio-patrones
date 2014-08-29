package com.designPatterns.behavioral.MediatorPatternWiki;

public class Mediator implements IMediator
{
	BtnView btnView;
	BtnSearch btnSearch;
	BtnBook btnBook;
	LblDisplay lblDisplay;
	
	@Override
	public void book() {
		btnBook.setEnabled(false);
		btnView.setEnabled(true);
		btnSearch.setEnabled(true);
		lblDisplay.setText("booking...");
	}

	@Override
	public void view() {
		btnBook.setEnabled(true);
		btnView.setEnabled(false);
		btnSearch.setEnabled(true);
		lblDisplay.setText("viewing...");
	}

	@Override
	public void search() {
		btnBook.setEnabled(true);
		btnView.setEnabled(true);
		btnSearch.setEnabled(false);
		lblDisplay.setText("searching...");
	}

	@Override
	public void registerView(BtnView view) {
		btnView = view;
	}

	@Override
	public void registerSearch(BtnSearch search) {
		btnSearch = search;
	}

	@Override
	public void registerBook(BtnBook book) {
		btnBook = book;
	}

	@Override
	public void registerDisplay(LblDisplay display) {
		lblDisplay = display; 
	}
	
}