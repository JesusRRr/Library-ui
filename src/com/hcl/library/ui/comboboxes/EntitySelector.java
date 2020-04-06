package com.hcl.library.ui.comboboxes;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

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
	
	private ScrollEntityTable ScrollBookTable;
	private ScrollEntityTable ScrollCustomerTable;
	private ScrollEntityTable ScrollAuthorTable;
	
	private JPanel tablePanel;
	
	
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
		
		//ScrollBars
		ScrollBookTable =new ScrollEntityTable(bookTable);
		ScrollCustomerTable=new ScrollEntityTable(customerTable);
		ScrollAuthorTable=new ScrollEntityTable(authorTable);
		
		tablePanel.add(ScrollBookTable);
		
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
	
	public ScrollEntityTable getChoosenTable(String entity) {
		switch(entity) {
		case "Books":
			System.out.println("books was choosen");
			return ScrollBookTable;
	
		
		case "Customers":
			System.out.println("customer was choosen");
			return ScrollCustomerTable;
		
		case "Authors":
			System.out.println("authors was choosen");
			return ScrollAuthorTable;
			
		default:
			return null;
		}
	}
}

