package com.hcl.library.ui.view.in;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.hcl.library.templates.HorizontalPosition;
import com.hcl.library.templates.PanelTemplate;
import com.hcl.library.ui.view.forms.fields.EntityField;

@SuppressWarnings("serial")
public class Login extends PanelTemplate{
	private JLabel title;
	private EntityField user;
	private EntityField password;
	private JButton submit;
	private Color COLOR=Color.gray;
	public Login() {
		this.setLayout(null);
		this.setSize(500,150);
		this.setBackground(COLOR);
		initComponents();
	}
	
	protected void initComponents() {
		
		title = new JLabel("Log-in");
		title.setSize(100,20);
		user = new EntityField("user", 100,150);
		//user.setBackground(COLOR);
		password = new EntityField("password",100,150);
		//password.setBackground(COLOR);
		submit = new JButton("Log-in");
		submit.setSize(100, 30);
		addComponents();
	}
	
	protected void addComponents() {	
		
		this.add(title);
		this.add(user);
		this.add(password);
		this.add(submit);
		
		this.setPlace(title, HorizontalPosition.CENTER);
		this.setPlace(user, HorizontalPosition.CENTER);
		this.setPlace(password, HorizontalPosition.CENTER);
		this.setPlace(submit, HorizontalPosition.CENTER);
	}

}
