package com.hcl.library.ui.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.hcl.library.templates.PanelTemplate;
import com.hcl.library.ui.comboboxes.CustomerSelector;

@SuppressWarnings("serial")
public class LoanPanel extends PanelTemplate{
	private JButton loanBookButton;
	private CustomerSelector customerSelector;
	
	
	public LoanPanel() {
		this.setLayout(new GridLayout(2,1));
		this.setSize(100,100);
		this.setBackground(Color.GRAY);
		initComponents();
	}
	@Override
	protected void initComponents() {
		loanBookButton=new JButton("Loan Book");	
		customerSelector=new CustomerSelector();
		
		addComponents();
	}

	@Override
	protected void addComponents() {
		this.add(customerSelector);
		this.add(loanBookButton);
	}
	
	public JButton getLoanBookButton() {
		return this.loanBookButton;
	}
	
	public CustomerSelector getCustomerSelector() {
		return this.customerSelector;
	}
	

}
