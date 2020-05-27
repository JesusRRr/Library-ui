package com.hcl.library.ui.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.hcl.library.StaffLogged;
import com.hcl.library.model.bo.StaffBO;

@SuppressWarnings("serial")
public class MainView extends JFrame{
	private StaffBO staff;
	private JPanel mainPanel;
	private NavBar navBarPanel;
	private JPanel mainImagePanel;
	
	public MainView() {
		//staff=StaffLogged.getStaff();
		//this.setTitle(staff.getName());
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
