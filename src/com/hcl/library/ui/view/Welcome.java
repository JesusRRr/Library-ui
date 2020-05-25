package com.hcl.library.ui.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.hcl.library.ui.view.in.RegisterPanel;

@SuppressWarnings("serial")
public class Welcome extends JFrame{
	private RegisterPanel register;
	
	
	public Welcome() {
		this.setLayout(null);
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		initComponents();
	}
	
	private void initComponents() {
		register= new RegisterPanel();
		addComponents();
	}
	
	private void addComponents() {
		this.add(register);
	
	}
}
