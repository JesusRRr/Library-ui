package com.hcl.library.ui.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.hcl.library.ui.view.in.Login;

@SuppressWarnings("serial")
public class Welcome extends JFrame{
	private Login login;
	
	public Welcome() {
		this.setLayout(null);
		this.setSize(1000,500);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		initComponents();
	}
	
	private void initComponents() {
		login=new Login();
		addComponents();
	}
	
	private void addComponents() {
		this.add(login);
	}
}
