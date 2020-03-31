package com.hcl.library;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Index extends JFrame {
	private JPanel searchSection;
	private JComboBox entitySelector;
	private JTextField searchField;
	
	public Index() {
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
	private void initComponents() {
		searchSection = new JPanel();
		entitySelector= new JComboBox();
		searchField= new JTextField();
		
		//JFrame configuration 
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(800,500);
		this.setLayout(null);
		
		//searchSection Panel configuration
		searchSection.setSize(800,100);
		searchSection.setBackground(Color.DARK_GRAY);
		this.add(searchSection);
		
		//entitySelector configuration
		entitySelector.setModel(new DefaultComboBoxModel<String>(new String[] {"Books","Customers"}));
		searchSection.add(entitySelector);
		
		//serchField configuration 
		searchField.setColumns(25);
		searchSection.add(searchField);
		
	}
	
	public static void main(String[] args) {
		new Index().setVisible(true);
	}

}
