package com.hcl.library;

import com.hcl.library.exceptions.CustomerDoesNotExistsException;
import com.hcl.library.model.bo.CustomerBO;
import com.hcl.library.service.CustomerService;

public class CurrentCustomer {
	private static CustomerBO customer;
	
	public static void setCustomer(CustomerBO customerBO) throws CustomerDoesNotExistsException {
		customer=CustomerService.getInstance().findByCurp(customerBO.getCurp());
		System.out.println(customer.getId());
	}
	
	public static CustomerBO getCustomer() {
		return customer;
	}
	
	
}
