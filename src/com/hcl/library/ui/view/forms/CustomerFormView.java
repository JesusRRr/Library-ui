package com.hcl.library.ui.view.forms;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.hcl.library.model.bo.AddressBO;
import com.hcl.library.model.bo.CustomerBO;
import com.hcl.library.service.CustomerService;
import com.hcl.library.ui.view.forms.fields.AddressField;
import com.hcl.library.ui.view.forms.fields.CustomerField;
import com.hcl.library.ui.view.forms.seccions.AddressFieldSeccion;

@SuppressWarnings("serial")
public class CustomerFormView extends EntityFormView{
	private List<String> fields;
	private List<CustomerField> customerFields;
	private List<AddressField> addressFields;
	private JButton submitButton;
	private JPanel submitPanel;
	private AddressFieldSeccion addressSeccion;
	private CustomerBO customer;
	private AddressBO address;
	
	public CustomerFormView() {
		initComponents();
	}
	
	private void initComponents() {
		this.setTitle("Customer form");
		fields =Arrays.asList
			(
				"Name",
				"LastName",
				"Curp",
				"Birtdate",
				"Email",
				"Phone"
			);
		
		customerFields = new ArrayList<>();
		customer = new CustomerBO();
		address = new AddressBO();
		submitPanel=new JPanel();
		submitButton=new JButton("Submit");
		addressSeccion= new AddressFieldSeccion();
		addressFields=addressSeccion.getAddressField();
	
		ActionListener saveCustomer=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//TODO make a for each for this operation;
				customer.setName(customerFields.get(0).getInput());
				customer.setLastName(customerFields.get(1).getInput());
				customer.setCurp(customerFields.get(2).getInput());
				customer.setBirthday(customerFields.get(3).getInputAsDate());
				customer.setEmail(customerFields.get(4).getInput());
				customer.setPhone(customerFields.get(5).getInput());
				
				
				address.setNumber(addressFields.get(0).getInputAsInt());
				address.setStreet(addressFields.get(1).getInput());
				address.setCity(addressFields.get(2).getInput());
				address.setState(addressFields.get(3).getInput());
				address.setCountry(addressFields.get(4).getInput());
				address.setPostalCode(addressFields.get(5).getInputAsInt());
				customer.setAddress(address);
				
				try {
					CustomerService.getInstance().creatCustomer(customer);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		};
				
		submitButton.addActionListener(saveCustomer);
		
		addComponents();
	}
	
	private void addComponents() {
		for(String field: fields) {
			CustomerField fieldObject=new CustomerField(field,100,300);
			customerFields.add(fieldObject);
			getPanel().add(fieldObject,SwingConstants.CENTER);
		}
		
		getPanel().add(addressSeccion);
		submitPanel.add(submitButton);
		getPanel().add(submitPanel);
		
		getPanel().setLayout(new GridLayout(getPanel().getComponentCount(),1));
		getPanel().setSize(700, getPanel().getComponentCount()*50);
		getFrame().setSize(700, getPanel().getComponentCount()*55);
	}
}
