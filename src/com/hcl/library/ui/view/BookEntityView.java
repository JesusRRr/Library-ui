package com.hcl.library.ui.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BookEntityView extends EntityFormView{
	private JButton submitButton;
	private JPanel namePanel;
	private List<String> fields;
	
	public BookEntityView() {
		initComponents();
	}
	
	private void initComponents() {
		namePanel=new JPanel();
		submitButton=new JButton("pero");
		fields =Arrays.asList
			(
				"Name",
				"isbn",
				"Edition",
				"Editorial",
				"Category",
				"Language",
				"Bookcover",
				"Status"
			);
		
		List<EntityField> FieldObjects = new ArrayList<>();
		for(String field: fields) {
			EntityField fieldObject=new EntityField(field);
			FieldObjects.add(fieldObject);
			getPanel().add(fieldObject);
		}
		
		submitButton=new JButton("Submit");
		submitButton.setSize(50, 20);
		getPanel().setLayout(new GridLayout(fields.size()+3,1));

		
		getPanel().add(submitButton);
		
		
	}

}
