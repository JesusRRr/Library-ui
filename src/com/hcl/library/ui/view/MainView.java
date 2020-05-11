package com.hcl.library.ui.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class MainView extends JFrame{
	private JPanel mainPanel;
	private NavBar navBarPanel;
	private JPanel mainImagePanel;
	
	public MainView() {
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainPanel=new JPanel(null);
		mainPanel.setSize(1000, 1000);
		mainPanel.setBackground(Color.BLACK);
		this.add(mainPanel);
		
		initComponents();
	}
	
	private void initComponents() {
		navBarPanel= new NavBar();
		navBarPanel.setSize(1000, 50);
		mainPanel.add(navBarPanel);
	}
	
}
