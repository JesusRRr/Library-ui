package com.hcl.library.ui.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.hcl.library.model.enums.StatusBook;

public class EntityField extends JPanel{
	JLabel entityLabelField;
	JTextField entityInputField;
	
	public EntityField(String field){
		entityLabelField=new JLabel(field);
		entityInputField=new JTextField("", 30);
		this.add(entityLabelField);
		this.add(entityInputField);
	}

	public String getEntityLabelField() {
		return entityLabelField.getText();
	}
	
	public String getInput() {
		return entityInputField.getText();
	}
	
	public StatusBook getBookStatusInput() {
		String status=entityInputField.getText();
		return StatusBook.valueOf(status);
	}
	
	
	
}
