package com.hcl.library.ui.view.in;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.hcl.library.templates.HorizontalPosition;
import com.hcl.library.templates.PanelTemplate;
import com.hcl.library.ui.view.forms.fields.EntityField;

@SuppressWarnings("serial")
public class Signin extends PanelTemplate{
	private JLabel title;
	private EntityField name;
	private EntityField lastName;
	private EntityField user;
	private EntityField password;
	private EntityField confirmPassword;
	private JButton submit;

	public Signin() {
		this.setSize(500,250);
		this.setLayout(null);
		initComponents();
	}
	
	@Override
	protected void initComponents() {
		title = new JLabel("Sign-in");
		title.setSize(100, 30);
		name = new EntityField("Name", 15);
		lastName= new EntityField("Last name", 15);
		user= new EntityField("User", 15);
		password= new EntityField("Password", 15);
		confirmPassword= new EntityField("Confirm", 15);
		submit=new JButton("Sign-in");
		submit.setSize(100, 30);
		addComponents();
	}

	@Override
	protected void addComponents() {
		this.add(title);
		this.add(name);
		this.add(lastName);
		this.add(user);
		this.add(password);
		this.add(confirmPassword);
		this.add(submit);
		
		for(Component component : this.getComponents()) {
			this.setPlace(component, HorizontalPosition.CENTER);
		}
		
	}

}
