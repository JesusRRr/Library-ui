package com.hcl.library.ui.view.forms;

import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AddressFieldPanel extends JPanel{
	
	
	public AddressFieldPanel() {
		initComponents();
	}
	
	private void initComponents(){
		this.setLayout(new GridLayout(2,3));
	}
}
