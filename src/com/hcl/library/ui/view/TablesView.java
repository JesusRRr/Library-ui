package com.hcl.library.ui.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import com.hcl.library.ui.comboboxes.EntitySelector;
import com.hcl.library.ui.tables.BookTableModel;
import com.hcl.library.ui.tables.CustomerTableModel;
import com.hcl.library.ui.tables.ScrollEntityTable;

@SuppressWarnings("serial")
public class TablesView extends JFrame {
	private JPanel searchSection;
	private JTextField searchField;
	private JButton searchButton;
	private JPanel tableSection;
	private EntitySelector entitySelector;


	public TablesView() {
		initComponents();
	}

	private void initComponents() {
		searchSection = new JPanel();
		searchField = new JTextField();
		searchButton = new JButton();
		tableSection = new JPanel();
		entitySelector = new EntitySelector(tableSection);
		

		// JFrame configuration
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		this.setResizable(false);
		this.setLayout(null);

		// searchSection Panel configuration
		searchSection.setSize(800, 100);
		searchSection.setBackground(Color.LIGHT_GRAY);
		this.add(searchSection);
		
		// tableSection Panel configuration
		tableSection.setBounds(0,100,800, 400);
		tableSection.setLayout(null);
		tableSection.setBackground(Color.GRAY);
		this.add(tableSection);

		// entitySelector configuration
		searchSection.add(entitySelector);
		searchSection.add(Box.createRigidArea(new Dimension(200,80)));
		

		// serchField configuration
		searchField.setColumns(25);
		searchSection.add(searchField);

		// searchButton configuration 
		searchButton.setText("Search");
		searchSection.add(searchButton);
		
		//TABLES 

		entitySelector.choseEntity();
		
	}
	
	

}
