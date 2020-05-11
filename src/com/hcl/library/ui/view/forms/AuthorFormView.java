package com.hcl.library.ui.view.forms;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.hcl.library.ui.view.fields.EntityField;

public class AuthorFormView extends EntityFormView{
	private JButton submitButton;
	private JPanel submitPanel;
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
			EntityField fieldObject=new EntityField(field,30);
			FieldObjects.add(fieldObject);
			getPanel().add(fieldObject);
		}
		
		submitButton=new JButton("Submit");
		submitButton.setSize(50, 20);
		submitPanel=new JPanel();
		submitPanel.add(submitButton);
	
		getPanel().add(submitPanel);
		
		getPanel().setLayout(new GridLayout(getPanel().getComponentCount(),1));
		
		getPanel().setSize(500, getPanel().getComponentCount()*60);
	}

}
