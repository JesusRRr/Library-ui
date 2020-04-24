package com.hcl.library.ui.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

	
	
	
}
