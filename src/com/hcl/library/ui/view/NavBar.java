package com.hcl.library.ui.view;

import javax.swing.JButton;
import javax.swing.JPanel;

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
		allBooks=new JButton("All books");
		addBook= new JButton("Add a Book");
		addCustomer= new JButton("Add a Customer");
		staffPerfil = new JButton("View Perfil");
		
		this.add(allBooks);
		this.add(addBook);
		this.add(addCustomer);
		this.add(staffPerfil);
	}
}
