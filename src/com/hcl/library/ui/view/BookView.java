package com.hcl.library.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hcl.library.CurrentCustomer;
import com.hcl.library.StaffLogged;
import com.hcl.library.exceptions.CustomerDoesNotExistsException;
import com.hcl.library.model.bo.BookBO;
import com.hcl.library.model.bo.CustomerBO;
import com.hcl.library.model.bo.LoanBO;
import com.hcl.library.model.enums.StatusLoan;
import com.hcl.library.service.LoanService;
import com.hcl.library.ui.comboboxes.CustomerSelector;
import com.hcl.library.ui.view.panels.BookDataPanel;

@SuppressWarnings("serial")
public class BookView extends JFrame{
	private JPanel mainPanel;
	private CustomerBO customerSelected;
	private CustomerSelector customerSelector;
	private BookImage imagePanel;
	private JPanel titlePanel;
	private BookDataPanel bookDataPanel;
	private JLabel title;
	private BookBO book;
	private LoanPanel loanPanel;
	private JButton loanBookButton;
	private LoanBO loan;
	private static LocalDate loanDate;
	private static LocalDate returnloanDate;


	public BookView(BookBO book) {
		this.setSize(800,620);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Books");
		this.book=book;
		initComponents();
	}
	
	private void initComponents() {
		loan= new LoanBO();
		titlePanel=new JPanel();
		title=new JLabel(book.getName());
		mainPanel=new JPanel(null);
		imagePanel=new BookImage(book.getName());
		bookDataPanel=new BookDataPanel(book);
		loanPanel= new LoanPanel();
		customerSelector=loanPanel.getCustomerSelector();
		loanBookButton=loanPanel.getLoanBookButton();
		
		
		
		//Actions
		customerSelector.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					customerSelected =(CustomerBO) customerSelector.getSelectedItem();	
					System.out.println(customerSelected);
					try {
						CurrentCustomer.setCustomer(customerSelected);
					} catch (CustomerDoesNotExistsException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		loanBookButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(CurrentCustomer.getCustomer()!=null) {
					
					loan.getBooks().add(book);
					loan.setCustomer(CurrentCustomer.getCustomer());
					loan.setStaff(StaffLogged.getStaff());
					System.out.println(StaffLogged.getStaff().getId());
					LoanService.getLoanService().createLoan(loan);
				}
				
			}
		});
		
		addComponents();
	}
	
	public void addComponents() {
		mainPanel.setSize(800, 600);
		this.add(mainPanel);
	
		titlePanel.setSize(800, 100);
		title.setFont(title.getFont().deriveFont(28.0f));
		titlePanel.add(title);
		
		imagePanel.setSize(200,300);
		imagePanel.setLocation(0, 100);
		
		loanPanel.setSize(200,200);
		loanPanel.setLocation(0, 400);
		
		bookDataPanel.setSize(600, 500);
		bookDataPanel.setLocation(200, 100);
		
		mainPanel.add(titlePanel);
		mainPanel.add(imagePanel);
		mainPanel.add(bookDataPanel);
		mainPanel.add(loanPanel);
	}
	
	
}
