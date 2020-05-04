package com.hcl.library.ui.tables;

import java.util.List;
import com.hcl.library.model.po.BookPO;
import com.hcl.library.service.BookService;

@SuppressWarnings("serial")
public class BookTableModel extends EntityTableModel{
	private String[] fields={"id","Name","isbn","editorial","edition","language","status"};
	
	public BookTableModel() {
		addColumns();
		addRows();
	}
	
	private void addColumns() {
		for(String field: fields) {
			this.addColumn(field);
		}
	}
	
	private void addRows() {
		refreshData();
	}
	
	private void refreshData() {
		  List<BookPO> books= BookService.getInstance().findAll();

		  Object[][] booksAsObjects = new  Object[books.size()][fields.length];
		  for(int row=0;row<books.size();row++) {
			  booksAsObjects[row][0]=books.get(row).getId();
			  booksAsObjects[row][1]=books.get(row).getName();
			  booksAsObjects[row][2]=books.get(row).getIsbn();
			  booksAsObjects[row][3]=books.get(row).getEditorial();
			  booksAsObjects[row][4]=books.get(row).getEdition();
			  booksAsObjects[row][5]=books.get(row).getLanguage();
			  booksAsObjects[row][6]=books.get(row).getStatus();
			  
			  this.addRow(booksAsObjects[row]);
		  }
		 
	}
}
