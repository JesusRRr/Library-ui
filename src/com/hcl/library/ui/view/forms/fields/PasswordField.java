package com.hcl.library.ui.view.forms.fields;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.hcl.library.templates.PanelTemplate;

public class PasswordField extends PanelTemplate{
	JLabel entityLabelField;
	JPasswordField passwordField;
	private String field;
	private int labelSize;
	private int inputSize;
	
	public PasswordField(String field, int labelSize, int inputSize){
		
		this.field=field;
		this.labelSize=labelSize;
		this.inputSize=inputSize;
		this.setLayout(null);
		this.setSize(labelSize+inputSize,25);
		initComponents();
	}

	
	@Override
	protected void initComponents() {
		entityLabelField=new JLabel(field, SwingConstants.RIGHT);
		entityLabelField.setSize(labelSize,25);
		entityLabelField.setLocation(0,0);
		passwordField=new JPasswordField();
		passwordField.setSize(inputSize,25);
		passwordField.setLocation(entityLabelField.getWidth(),0);
		
		addComponents();
	}

	@Override
	protected void addComponents() {
		this.add(entityLabelField);
		this.add(passwordField);
	}

	public String getEntityLabelField() {
		return entityLabelField.getText();
	}
	
	public String getInput() {
		return String.valueOf(passwordField.getPassword());
	}
	
	public void setInput(String input) {
		passwordField.setText(input);
	}
	
}
