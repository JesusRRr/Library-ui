package com.hcl.library;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class BookTableModel extends DefaultTableModel{
	
	public BookTableModel() {
		addColumns();
		addRows();
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}
	
	void addColumns() {
		this.addColumn("id");
		this.addColumn("Name");
		this.addColumn("isbn");
		this.addColumn("editorial");
		this.addColumn("edition");
		this.addColumn("language");
		this.addColumn("status");
		this.addColumn("authors");
	}
	
	void addRows() {
		String[] row= {"1","lord of the rings", "2450"};
		String[] row1= {"1","lord of the rings", "2450"};
		String[] row2= {"1","lord of the rings", "2450"};
		String[] row3= {"1","lord of the rings", "2450"};
		String[] row4= {"1","lord of the rings", "2450"};
		String[] row5= {"1","lord of the rings", "2450"};
		String[] row6= {"1","lord of the rings", "2450"};
		String[] row7= {"1","lord of the rings", "2450"};
		String[] row8= {"1","lord of the rings", "2450"};
		String[] row9= {"1","lord of the rings", "2450"};
		String[] row10= {"1","lord of the rings", "2450"};
		String[] row11= {"1","lord of the rings", "2450"};
		String[] row12= {"1","lord of the rings", "2450"};
		String[] row13= {"1","lord of the rings", "2450"};
		String[] row14= {"1","lord of the rings", "2450"};
		String[] row15= {"1","lord of the rings", "2450"};
		String[] row16= {"1","lord of the rings", "2450"};
		this.addRow(row);
		this.addRow(row1);
		this.addRow(row2);
		this.addRow(row3);
		this.addRow(row4);
		this.addRow(row5);
		this.addRow(row6);
		this.addRow(row7);
		this.addRow(row8);
		this.addRow(row9);
		this.addRow(row10);
		this.addRow(row11);
		this.addRow(row12);
		this.addRow(row13);
		this.addRow(row14);
		this.addRow(row15);
		this.addRow(row16);
	}
}
