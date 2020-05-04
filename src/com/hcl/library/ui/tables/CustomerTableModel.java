package com.hcl.library.ui.tables;


@SuppressWarnings("serial")
public class CustomerTableModel extends PersonTableModel{
	
	public CustomerTableModel() {
		addColumns();
		addRows();
	}

	
	void addColumns() {
		this.addColumn("Phone");
		this.addColumn("email");
		this.addColumn("status");
	
	}
	
	void addRows() {
		
		/*TO-DO
		 *1.-get book from database 
		 *2.-Do a for-each and addRow to table
		*/
	
	}
}
