package com.hcl.library.ui.tables;

@SuppressWarnings("serial")
public class AuthorTableModel extends PersonTableModel{
	
	public AuthorTableModel() {
		addColumns();
		addRows();
	}
	
	void addColumns() {
		this.addColumn("Nationality");
	}
	
	void addRows() {
		
	}
}
