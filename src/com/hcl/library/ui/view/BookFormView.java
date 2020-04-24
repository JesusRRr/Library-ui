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

import com.hcl.library.ui.buttons.AuthorButtonField;

@SuppressWarnings("serial")
public class BookFormView extends EntityFormView{
	private JButton submitButton;
	private List<String> fields;
	private AuthorButtonField authorbutton;
	private JPanel submitPanel;
	
	public BookFormView() {
		initComponents();
	}
	
	private void initComponents() {
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
		authorbutton=new AuthorButtonField();
		submitButton=new JButton("Submit");
		submitPanel=new JPanel();
		submitPanel.add(submitButton);
		
		getPanel().add(authorbutton);
		getPanel().add(submitPanel);
		getPanel().setLayout(new GridLayout(getPanel().getComponentCount(),1));
		
	}

}
