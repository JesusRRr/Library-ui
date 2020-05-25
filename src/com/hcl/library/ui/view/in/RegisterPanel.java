package com.hcl.library.ui.view.in;

import java.awt.Color;

import com.hcl.library.templates.HorizontalPosition;
import com.hcl.library.templates.PanelTemplate;

@SuppressWarnings("serial")
public class RegisterPanel extends PanelTemplate{
	private Login login;
	private Signin signin;
	
	
	public RegisterPanel() {

		this.setBackground(Color.white);
		this.setLayout(null);
		initComponents();
	}

	@Override
	protected void initComponents() {
		login = new Login();
		signin = new Signin();
		
		addComponents();
	}

	@Override
	protected void addComponents(){
		this.add(login);
		this.add(signin);	
		login.setLocation(0, 0);
		signin.setLocation(0, login.getHeight());
		this.setSize(login.getWidth(),login.getHeight()+signin.getHeight());
	}

}
