package com.hcl.library.ui.view.forms.fields;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.hcl.library.templates.PanelTemplate;

@SuppressWarnings("serial")
public class EntityField extends PanelTemplate{
	JLabel entityLabelField;
	JTextField entityInputField;
	private String field;
	private int labelSize;
	private int inputSize;
	
	public EntityField(String field, int labelSize, int inputSize){
		
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
		entityInputField=new JTextField();
		entityInputField.setSize(inputSize,25);
		entityInputField.setLocation(entityLabelField.getWidth(),0);
		
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
