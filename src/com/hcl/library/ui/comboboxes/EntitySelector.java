package com.hcl.library.ui.comboboxes;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.hcl.library.ui.tables.AuthorTableModel;
import com.hcl.library.ui.tables.BookTableModel;
import com.hcl.library.ui.tables.CustomerTableModel;
import com.hcl.library.ui.tables.ScrollEntityTable;

@SuppressWarnings("serial")
public class EntitySelector extends JComboBox<String>{
	private String entity;
	private String[] entities;
	
	private JTable bookTable;
	private JTable customerTable;
	private JTable authorTable;
	
	private BookTableModel bookTableModel;
	private CustomerTableModel customerTableModel;
	private AuthorTableModel authorTableModel;
	
	private ScrollEntityTable scrollBookTable;
	private ScrollEntityTable scrollCustomerTable;
	private ScrollEntityTable scrollAuthorTable;
	
	private ScrollEntityTable actualTable;
	
	private JPanel tablePanel;
	
	private String BookSelected; 
	
	public EntitySelector(JPanel tablePanel) {
		this.tablePanel=tablePanel;
		this.entities= new String[] {"Books", "Customers", "Authors"};
		this.setModel(new DefaultComboBoxModel<String>(this.entities));
		
		//Tables Models
		bookTableModel = new BookTableModel();
		customerTableModel = new CustomerTableModel();
		authorTableModel = new AuthorTableModel();
		
		//Tables
		bookTable = new JTable(bookTableModel);
		customerTable = new JTable(customerTableModel);
		authorTable = new JTable(authorTableModel);
		
		bookTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				BookSelected=bookTable.getValueAt(bookTable.getSelectedRow(), 1).toString();
			}
		});
		
		//ScrollBars
		scrollBookTable =new ScrollEntityTable(bookTable);
		scrollCustomerTable=new ScrollEntityTable(customerTable);
		scrollAuthorTable=new ScrollEntityTable(authorTable);
		
		
		this.actualTable=scrollBookTable;
		tablePanel.add(scrollBookTable);
		
	}
	
	public String getBookChoosen() {
		return BookSelected;
	}
	
	public String choseEntity() {
		
		this.addItemListener(new ItemListener() {
		
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					entity=getSelectedItem().toString();
					
					tablePanel.add(getChoosenTable(entity));
				}
			}
			
		});
		
		return entity;
	}
	
	
	public void changeTableVisibility(ScrollEntityTable actualTable) {
		this.actualTable.setVisible(false);
		this.actualTable=actualTable;
		this.actualTable.setVisible(true);
	}
	
	public ScrollEntityTable getChoosenTable(String entity) {
		switch(entity) {
		case "Books":
			System.out.println("books was choosen");
			changeTableVisibility(scrollBookTable);
			return scrollBookTable;

		case "Customers":
			System.out.println("customer was choosen");
			changeTableVisibility(scrollCustomerTable);
			return scrollCustomerTable;
		
		case "Authors":
			System.out.println("authors was choosen");
			changeTableVisibility(scrollAuthorTable);
			return scrollAuthorTable;
			
		default:
			return null;
		}
	}
}

