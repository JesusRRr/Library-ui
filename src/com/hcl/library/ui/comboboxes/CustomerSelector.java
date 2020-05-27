package com.hcl.library.ui.comboboxes;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import com.hcl.library.model.po.CustomerPO;
import com.hcl.library.service.CustomerService;

@SuppressWarnings("serial")
public class CustomerSelector extends JComboBox<CustomerPO>{
	
	public CustomerSelector() {
		this.setModel(new DefaultComboBoxModel<CustomerPO>(getCustomers()));
	}
	
	public CustomerPO[] listToArray(List<CustomerPO> customers) {
		CustomerPO[] array = new CustomerPO[customers.size()];
		int index=0;
		
		for(CustomerPO customer : customers) {
			array[index++]=customer;
		}
		return array;
	}
	
	public CustomerPO[] getCustomers() {
		
		return listToArray(CustomerService.getInstance().findAll());
	}

}
