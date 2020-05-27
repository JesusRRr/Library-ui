package com.hcl.library.ui.view;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;

import com.hcl.library.templates.PanelTemplate;

@SuppressWarnings("serial")
public class LoanButtonPanel extends PanelTemplate{
	private JButton loanBookButton;
	private JComboBox<String> custumerSelector;
	
	
	public LoanButtonPanel() {
		this.setLayout(new GridLayout(2,1));
		this.setSize(200, 200);
		initComponents();
	}
	@Override
	protected void initComponents() {
		loanBookButton=new JButton("Loan Book");	
		
		
		addComponents();
	}

	@Override
	protected void addComponents() {
		this.add(loanBookButton);
	}
	
	public JButton getLoanBookButton() {
		return this.loanBookButton;
	}
	

}
