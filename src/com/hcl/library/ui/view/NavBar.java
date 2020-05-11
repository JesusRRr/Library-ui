package com.hcl.library.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.hcl.library.ui.view.forms.BookFormView;
import com.hcl.library.ui.view.forms.CustomerFormView;

@SuppressWarnings("serial")
public class NavBar extends JPanel{
	private JButton allBooks;
	private JButton addBook;
	private JButton addCustomer;
	private JButton staffPerfil;
	
	public NavBar() {
		initComponents();
	}
	
	private void initComponents() {
		allBooks=new JButton("System");
		addBook= new JButton("Add a Book");
		addCustomer= new JButton("Add a Customer");
		staffPerfil = new JButton("View Perfil");
		
		this.add(allBooks);
		this.add(addBook);
		this.add(addCustomer);
		this.add(staffPerfil);
		
		ActionListener showBookForm = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new BookFormView().setVisible(true);
				
			}
		};
		
		addBook.addActionListener(showBookForm);
		
		ActionListener showAllEntities = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Que show");	
				new TablesView().setVisible(true);
			}
			
		};
		
		allBooks.addActionListener(showAllEntities);
		
		ActionListener showCustomerForm = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Customer");	
				new CustomerFormView().setVisible(true);
			}
			
		};
		
		addCustomer.addActionListener(showCustomerForm);
	}
}
