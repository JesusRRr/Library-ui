package com.hcl.library.ui.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BookEntityView extends EntityFormView{
	private JTextField nameField;
	private JLabel label;
	private JButton submitButton;
	private JPanel namePanel;
	
	public BookEntityView() {
		initComponents();
	}
	
	private void initComponents() {
		namePanel=new JPanel();
		submitButton=new JButton("pero");
		label = new JLabel("hola");
		
		JLabel nameLabel = new JLabel("Name");
		JTextField nameInput = new JTextField("",30);
		
		namePanel.add(nameLabel);
		namePanel.add(nameInput);
		getPanel().add(namePanel);
		
		JLabel isbnLabel = new JLabel("isbn");
		JLabel editionLabel = new JLabel("Edition");
		JLabel editorialLabel = new JLabel("Editorial");
		JLabel categoryLabel = new JLabel("Category");
		JLabel languageLabel = new JLabel("Language");
		JLabel bookcoverLabel = new JLabel("Bookcover");
		JLabel statusLabel = new JLabel("Status");
		JLabel authorsLabel = new JLabel("Authors");
		JButton submitButton=new JButton("Submit");
		submitButton.setSize(50, 20);
		getPanel().setLayout(new GridLayout(16,1));

		
		getPanel().add(submitButton);
		
		
	}

}
