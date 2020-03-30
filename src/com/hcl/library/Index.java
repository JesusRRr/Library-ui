package com.hcl.library;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Index extends JFrame{
	public Index() {
		this.setTitle("Index");
		this.setLocation(200,100);
		this.setSize(800,500);
		this.setVisible(true);
		this.setResizable(false);
		components();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void components() {
		JPanel mainPanel = new JPanel();
		JLabel searchLabel = new JLabel();
		
		mainPanel.setBackground(Color.DARK_GRAY);
		
		this.getContentPane().add(mainPanel);
	}
	
	

}
