package com.hcl.library;

import java.awt.Color;
import java.awt.Dimension;

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

import com.hcl.library.ui.tables.BookTableModel;
import com.hcl.library.ui.tables.CustomerTableModel;
import com.hcl.library.ui.tables.ScrollEntityTable;

@SuppressWarnings("serial")
public class Index extends JFrame {
	private JPanel searchSection;
	private JComboBox<String> entitySelector;
	private JTextField searchField;
	private JButton searchButton;
	private JPanel tableSection;
	private JScrollPane scrollBookTable;
	private DefaultTableModel bookTableModel;
	private JTable bookTable;
	private JTable customerTable;

	public Index() {
		initComponents();
	}

	private void initComponents() {
		searchSection = new JPanel();
		entitySelector = new JComboBox<>();
		searchField = new JTextField();
		searchButton = new JButton();
		tableSection = new JPanel();
		

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
		entitySelector.setModel(new DefaultComboBoxModel<String>(new String[] { "Books", "Customers" }));
		searchSection.add(entitySelector);
		searchSection.add(Box.createRigidArea(new Dimension(200,80)));
		

		// serchField configuration
		searchField.setColumns(25);
		searchSection.add(searchField);

		// searchButton configuration 
		searchButton.setText("Search");
		searchSection.add(searchButton);
		
		//TABLES 
		
		//BookTable configuration
		
		BookTableModel btm = new BookTableModel();
		CustomerTableModel ctm = new CustomerTableModel();
		
		bookTable = new JTable(btm);
		customerTable = new JTable(ctm);
		ScrollEntityTable ScrollBookTable=new ScrollEntityTable(bookTable);
		ScrollEntityTable ScrollCustomerTable=new ScrollEntityTable(customerTable);
		
		tableSection.add(ScrollBookTable.getScrollComponent());
		
	}

	public static void main(String[] args) {
		new Index().setVisible(true);
	}

}
