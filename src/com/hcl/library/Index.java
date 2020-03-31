package com.hcl.library;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Index extends JFrame {
	private JPanel searchSection;
	
	public Index() {
		initComponents();
	}
	
	private void initComponents() {
		searchSection = new JPanel();
		
		//JFrame configuration 
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(800,500);
		this.setLayout(null);
		
		//searchSection Panel configuration
		searchSection.setSize(800,100);
		searchSection.setBackground(Color.DARK_GRAY);
		this.add(searchSection);
	}
	
	public static void main(String[] args) {
		new Index().setVisible(true);
	}

}
