package com.hcl.library.ui.view.in;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

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
		this.setLayout(new GridBagLayout());
		this.setSize(500,100);
		this.setBackground(COLOR);
		initComponents();
	}
	
	protected void initComponents() {
		constraints = new GridBagConstraints();
		title = new JLabel("Log-in");
		user = new EntityField("user", 10);
		user.setBackground(COLOR);
		password = new EntityField("password",10);
		password.setBackground(COLOR);
		submit = new JButton("Log-in");
		addComponents();
	}
	
	protected void addComponents() {	
		
		this.add(title,this.setConstraints(0,0,3,1));
		this.add(user,this.setConstraints(0,1,1,1));
		this.add(password,this.setConstraints(1,1,1,1));
		this.add(submit,this.setConstraints(2,1,1,1));
	}

}
