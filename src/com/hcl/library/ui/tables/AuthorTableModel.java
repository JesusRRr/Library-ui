package com.hcl.library.ui.tables;

import java.util.List;
import com.hcl.library.model.po.AuthorPO;
import com.hcl.library.service.AuthorService;

@SuppressWarnings("serial")
public class AuthorTableModel extends EntityTableModel{
	private String[] fields= {"id","Name","LastName","Nationality"};
	
	public AuthorTableModel() {
		addColumns();
		addRows();
	}
	
	void addColumns() {
		for(String field: fields) {
			this.addColumn(field);
		}
	}
	
	void addRows() {
		refreshData();
	}
	
	private void refreshData() {
		  List<AuthorPO> authors= AuthorService.getInstance().findAll();

		  Object[][] authorsAsObjects = new  Object[authors.size()][fields.length];
		  for(int row=0;row<authors.size();row++) {
			  authorsAsObjects[row][0]=authors.get(row).getId();
			  authorsAsObjects[row][1]=authors.get(row).getName();
			  authorsAsObjects[row][2]=authors.get(row).getLastName();
			  authorsAsObjects[row][3]=authors.get(row).getNacionality();
	 
			  this.addRow(authorsAsObjects[row]);
		  }
		 
	}
}
