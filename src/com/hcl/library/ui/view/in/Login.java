package com.hcl.library.ui.view.in;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.hcl.library.templates.HorizontalPosition;
import com.hcl.library.templates.PanelTemplate;
import com.hcl.library.ui.view.forms.fields.EntityField;
import com.hcl.library.ui.view.forms.fields.PasswordField;

@SuppressWarnings("serial")
public class Login extends PanelTemplate{
	private JLabel title;
	private EntityField user;
	private PasswordField password;
	private JButton submitButton;
	private Color COLOR=Color.gray;
	public Login() {
		this.setLayout(null);
		this.setSize(500,150);
		this.setBackground(COLOR);
		initComponents();
	}
	
	protected void initComponents() {
		
		title = new JLabel("Log-in", SwingConstants.CENTER);
		title.setSize(100,20);
		user = new EntityField("user: ", 100,150);
		user.setBackground(COLOR);
		password = new PasswordField("password: ",100,150);
		password.setBackground(COLOR);
		submitButton = new JButton("Log-in");
		submitButton.setSize(100, 30);
		addComponents();
	
	}
	
	protected void addComponents() {	
		
		this.add(title);
		this.add(user);
		this.add(password);
		this.add(submitButton);
	
		
		this.setPlace(title, HorizontalPosition.CENTER);
		this.setPlace(user, HorizontalPosition.CENTER);
		this.setPlace(password, HorizontalPosition.CENTER);
		this.setPlace(submitButton, HorizontalPosition.CENTER);
		
	}
	
	public JButton getSubmitButton() {
		return this.submitButton;
	}
	
	public EntityField getUser() {
		return this.user;
	}
	
	public PasswordField getPassword() {
		return this.password;
	}
	
}
