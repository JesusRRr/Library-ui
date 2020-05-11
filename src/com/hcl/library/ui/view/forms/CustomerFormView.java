package com.hcl.library.ui.view.forms;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

import com.hcl.library.model.bo.CustomerBO;
import com.hcl.library.service.CustomerService;

@SuppressWarnings("serial")
public class CustomerFormView extends EntityFormView{
	private List<String> fields;
	private JButton submitButton;
	
	public CustomerFormView() {
		initComponents();
	}
	private void initComponents() {
		fields =Arrays.asList
			(
				"Name",
				"LastName",
				"Curp",
				"Birtdate",
				"Email",
				"Phone"
			);
		
		List<EntityField> FieldObjects = new ArrayList<>();
		for(String field: fields) {
			EntityField fieldObject=new EntityField(field);
			FieldObjects.add(fieldObject);
			getPanel().add(fieldObject);
		}
		submitButton=new JButton("Submit");
		
		getPanel().setLayout(new GridLayout(getPanel().getComponentCount(),1));
		getPanel().setSize(650, getPanel().getComponentCount()*50);
		getFrame().setSize(700, getPanel().getComponentCount()*55);
		
		
		ActionListener saveCustomer=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CustomerBO customer = new CustomerBO();
				customer.setName(FieldObjects.get(0).getInput());
				customer.setLastName(FieldObjects.get(1).getInput());
				customer.setCurp(FieldObjects.get(2).getInput());
				//customer.setBirthday(FieldObjects.get(3).getInput())
				customer.setEmail(FieldObjects.get(4).getInput());
				customer.setPhone(FieldObjects.get(5).getInput());
				;
				
			
				
				try {
					CustomerService.getInstance().creatCustomer(customer);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		};
				
		submitButton.addActionListener(saveCustomer);
	}
}
