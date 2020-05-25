package com.hcl.library.ui.view.forms.fields;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.hcl.library.templates.PanelTemplate;

@SuppressWarnings("serial")
public class EntityField extends PanelTemplate{
	JLabel entityLabelField;
	JTextField entityInputField;
	private String field;
	private int size;
	JLabel space;
	
	public EntityField(String field, int size){
		
		this.field=field;
		this.size=size;
		this.setLayout(null);
		this.setSize(300,25);
		this.setBackground(Color.gray);
		initComponents();
	}
	
	@Override
	protected void initComponents() {
		entityLabelField=new JLabel(field);
		entityLabelField.setSize(150,25);
		entityLabelField.setLocation(0,0);
		entityInputField=new JTextField();
		entityInputField.setSize(150,25);
		entityInputField.setLocation(100,0);
		
		addComponents();
	}

	@Override
	protected void addComponents() {
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
