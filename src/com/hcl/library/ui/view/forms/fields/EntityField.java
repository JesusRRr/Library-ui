package com.hcl.library.ui.view.forms.fields;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.hcl.library.model.enums.StatusBook;

public class EntityField extends JPanel{
	JLabel entityLabelField;
	JTextField entityInputField;
	JLabel space;
	
	public EntityField(String field, int size){
		
		

		entityLabelField=new JLabel(field);
		
		this.add(entityLabelField);
		
		entityInputField=new JTextField("", size);
		
		
		this.add(entityInputField);
	}

	public String getEntityLabelField() {
		return entityLabelField.getText();
	}
	
	public String getInput() {
		return entityInputField.getText();
	}

	
	
}
