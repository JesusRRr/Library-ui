package com.hcl.library.ui.view;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class AuthorFormView extends EntityFormView{
	private JButton submitButton;
	private List<String> fields;
	
	public AuthorFormView() {
		initComponents();
	}
	
	private void initComponents() {
		fields =Arrays.asList
				(
					"Name",
					"LastName",
					"Nationality"
				);
		List<EntityField> FieldObjects = new ArrayList<>();
		for(String field: fields) {
			EntityField fieldObject=new EntityField(field);
			FieldObjects.add(fieldObject);
			getPanel().add(fieldObject);
		}
		
		submitButton=new JButton("Submit");
		submitButton.setSize(50, 20);
		getPanel().setLayout(new GridLayout(fields.size()+1,1));

		
		getPanel().add(submitButton);
	}

}
