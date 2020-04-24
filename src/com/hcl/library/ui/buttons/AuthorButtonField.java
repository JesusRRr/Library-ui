package com.hcl.library.ui.buttons;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AuthorButtonField extends JPanel{
	JLabel labelField;
	JButton authorFormViewButton;
	
	public AuthorButtonField() {
		labelField=new JLabel("Authors");
		authorFormViewButton=new JButton("Go to Authors");
		this.add(labelField);
		this.add(authorFormViewButton);
		
	}
}
