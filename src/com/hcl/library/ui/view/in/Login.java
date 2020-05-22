package com.hcl.library.ui.view.in;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.hcl.library.ui.view.forms.fields.EntityField;

@SuppressWarnings("serial")
public class Login extends JPanel{
	private EntityField user;
	private EntityField password;
	private JButton submit;
	
	public Login() {
		this.setSize(100,50);
		
		initComponents();
	}
	
	private void initComponents() {
		user = new EntityField("user", 20);
		password = new EntityField("password",20);
		addComponents();
	}
	
	private void addComponents() {
		this.add(user);
		this.add(password);
	}
}
