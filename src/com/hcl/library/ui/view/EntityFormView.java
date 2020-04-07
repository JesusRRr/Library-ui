package com.hcl.library.ui.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class EntityFormView extends JFrame{
	private JPanel formSection;
	
	public EntityFormView() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(500, 800);
		this.setResizable(false);
		this.setLayout(null);
	}
}
