package com.hcl.library;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Index extends JFrame {
	private JPanel searchSection;
	private JComboBox<String> entitySelector;
	private JTextField searchField;
	private JButton searchButton;

	public Index() {
		initComponents();
	}

	private void initComponents() {
		searchSection = new JPanel();
		entitySelector = new JComboBox<>();
		searchField = new JTextField();
		searchButton = new JButton();

		// JFrame configuration
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		this.setResizable(false);
		this.setLayout(null);

		// searchSection Panel configuration
		searchSection.setSize(800, 100);
		searchSection.setBackground(Color.DARK_GRAY);
		this.add(searchSection);

		// entitySelector configuration
		entitySelector.setModel(new DefaultComboBoxModel<String>(new String[] { "Books", "Customers" }));
		//entitySelector.setBorder(BorderFactory.createEmptyBorder(5,50,10,10));
		searchSection.add(entitySelector);
		

		// serchField configuration
		searchField.setColumns(25);
		searchSection.add(searchField);

		// searchButton configuration 
		searchButton.setText("Search");
		searchSection.add(searchButton);
	}

	public static void main(String[] args) {
		new Index().setVisible(true);
	}

}
