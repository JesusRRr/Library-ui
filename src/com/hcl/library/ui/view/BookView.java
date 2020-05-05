package com.hcl.library.ui.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class BookView extends JFrame{
	private JPanel mainPanel;
	private BookImage imagePanel;
	private JPanel titlePanel;
	private JPanel dataPanel;
	private JLabel title;
	
	public BookView() {
		this.setSize(800,600);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Books");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		initComponents();
	}
	
	private void initComponents() {
		titlePanel=new JPanel();
		mainPanel=new JPanel(null);
		imagePanel=new BookImage();
		dataPanel=new JPanel();
		title=new JLabel("Book Name");
		
		mainPanel.setSize(800, 600);
		this.add(mainPanel);
	
		titlePanel.setSize(800, 100);
		title.setFont(title.getFont().deriveFont(32.0f));
		titlePanel.add(title);
		
		imagePanel.setSize(200,300);
		imagePanel.setLocation(0, 100);
		
		dataPanel.setSize(600, 500);
		dataPanel.setLocation(200, 100);
		dataPanel.setBackground(Color.DARK_GRAY);
		
		mainPanel.add(titlePanel);
		mainPanel.add(imagePanel);
		mainPanel.add(dataPanel);
	}
	
	
}
