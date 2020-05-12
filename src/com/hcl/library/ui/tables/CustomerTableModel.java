package com.hcl.library.ui.tables;

import java.util.List;

import com.hcl.library.model.po.CustomerPO;
import com.hcl.library.service.CustomerService;

@SuppressWarnings("serial")
public class CustomerTableModel extends PersonTableModel{
	private String[] fields= {"id","Name","LastName","Curp","Birhday","Phone","Email","address"};
	
	public CustomerTableModel() {
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
		  List<CustomerPO> customers= CustomerService.getInstance().findAll();

		  Object[][] CustomerAsObjects = new  Object[customers.size()][fields.length];
		  for(int row=0;row<customers.size();row++) {
			  CustomerAsObjects[row][0]=customers.get(row).getId();
			  CustomerAsObjects[row][1]=customers.get(row).getName();
			  CustomerAsObjects[row][2]=customers.get(row).getLastName();
			  CustomerAsObjects[row][3]=customers.get(row).getCurp();
			  CustomerAsObjects[row][4]=customers.get(row).getBirthday();
			  CustomerAsObjects[row][5]=customers.get(row).getPhone();
			  CustomerAsObjects[row][6]=customers.get(row).getEmail();
			  CustomerAsObjects[row][7]=new StringBuilder(
					  customers.get(row).getAddress().getStreet())
					  .append(" ")
					  .append(customers.get(row).getAddress().getNumber());
				  
			  this.addRow(CustomerAsObjects[row]);
			  this.getTableModelListeners();
		  }
		 
	}
	
}
