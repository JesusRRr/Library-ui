package com.hcl.library.ui.comboboxes;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import com.hcl.library.model.bo.CustomerBO;
import com.hcl.library.service.CustomerService;

@SuppressWarnings("serial")
public class CustomerSelector extends JComboBox<CustomerBO> {
	private CustomerBO customerSelected;

	public CustomerSelector() {
		this.setModel(new DefaultComboBoxModel<CustomerBO>(getCustomers()));
		this.setRenderer(new ComboBoxRender("Select customer"));
		this.setSelectedIndex(-1);
	}

	public CustomerBO[] listToArray(List<CustomerBO> customers) {
		CustomerBO[] array = new CustomerBO[customers.size()];
		int index = 0;

		for (CustomerBO customer : customers) {
			array[index++] = customer;
		}
		return array;
	}

	public CustomerBO[] getCustomers() {

		return listToArray(CustomerService.getInstance().findAll());
	}


}
