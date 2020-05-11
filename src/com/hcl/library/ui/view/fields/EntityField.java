package com.hcl.library.ui.view.fields;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.hcl.library.model.enums.StatusBook;

public class EntityField extends JPanel{
	JLabel entityLabelField;
	JTextField entityInputField;
	
	public EntityField(String field, int size){
		entityLabelField=new JLabel(field);
		entityInputField=new JTextField("", size);
		this.add(entityLabelField);
		this.add(entityInputField);
	}

	public String getEntityLabelField() {
		return entityLabelField.getText();
	}
	
	public String getInput() {
		return entityInputField.getText();
	}

	
	
}
