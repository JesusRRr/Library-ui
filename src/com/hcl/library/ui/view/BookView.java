package com.hcl.library.ui.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hcl.library.model.bo.BookBO;
import com.hcl.library.model.bo.CustomerBO;
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


	public BookView(BookBO book) {
		this.setSize(800,620);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Books");
		this.book=book;
		initComponents();
	}
	
	private void initComponents() {
		titlePanel=new JPanel();
		title=new JLabel(book.getName());
		mainPanel=new JPanel(null);
		imagePanel=new BookImage(book.getName());
		bookDataPanel=new BookDataPanel(book);
		loanPanel= new LoanPanel();
		customerSelector=loanPanel.getCustomerSelector();
		customerSelector.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					customerSelected =(CustomerBO) customerSelector.getSelectedItem();	
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
