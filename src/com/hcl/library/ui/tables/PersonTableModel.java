package com.hcl.library.ui.tables;

@SuppressWarnings("serial")
public abstract class  PersonTableModel extends EntityTableModel{
	public PersonTableModel() {
		
		
	}

	
	void Columns() {
		this.addColumn("id");
		this.addColumn("Name");
		this.addColumn("LastName");
		this.addColumn("Curp");
	
	}

}
