package com.hcl.library.ui.view;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class BookView extends JFrame{
	private JPanel mainPanel;
	private JPanel imagePanel;
	private JPanel dataPanel;
	private BufferedImage image;
	
	public BookView() {
		this.setSize(800,600);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Books");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		initComponents();
	}
	
	private void initComponents() {
		mainPanel=new JPanel(null);
		imagePanel=new JPanel();
		dataPanel=new JPanel();
		
		mainPanel.setSize(800, 600);
		this.add(mainPanel);
		
		imagePanel.setSize(200,300);
		imagePanel.setBackground(Color.BLACK);
		
		dataPanel.setSize(600, 600);
		dataPanel.setLocation(200, 0);
		dataPanel.setBackground(Color.DARK_GRAY);
		
		mainPanel.add(imagePanel);
		mainPanel.add(dataPanel);
		getImage();
	}
	
	private void getImage(){
		
	}
}
