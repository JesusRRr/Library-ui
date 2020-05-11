package com.hcl.library.ui.view.forms;

import java.awt.GridLayout;

import javax.swing.JPanel;

import com.hcl.library.ui.view.fields.CustomerField;

@SuppressWarnings("serial")
public class AddressFieldSeccion extends JPanel{
	private CustomerField customerField;
	
	public AddressFieldSeccion() {
		initComponents();
	}
	
	private void initComponents(){
		this.setLayout(new GridLayout(2,3));
	}
}
