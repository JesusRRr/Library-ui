package com.hcl.library.ui.view;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BookEntityView extends EntityFormView{
	private JTextField nameField;
	
	
	public BookEntityView() {
		initComponents();
	}
	
	private void initComponents() {
		nameField=new JTextField();
		nameField.setLocation(20, 10);
		
		formSection.add(nameField);
	}

}
