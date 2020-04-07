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
import com.hcl.library.ui.tables.EntityTable;

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
	
	private EntityTable scrollBookTable;
	private EntityTable scrollCustomerTable;
	private EntityTable scrollAuthorTable;
	
	private EntityTable actualTable;
	
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
		scrollBookTable =new EntityTable(bookTable);
		scrollCustomerTable=new EntityTable(customerTable);
		scrollAuthorTable=new EntityTable(authorTable);
		
		this.actualTable=scrollBookTable;
		tablePanel.add(scrollBookTable);
		
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
	
	
	public void changeTableVisibility(EntityTable actualTable) {
		this.actualTable.setVisible(false);
		this.actualTable=actualTable;
		this.actualTable.setVisible(true);
	}
	
	public EntityTable getChoosenTable(String entity) {
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

