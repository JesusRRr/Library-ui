package com.hcl.library.ui.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FieldPanel extends JPanel{
	public FieldPanel(String field) {
		
		this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		this.add(new JLabel(field));
	}
}
