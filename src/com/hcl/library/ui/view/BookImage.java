package com.hcl.library.ui.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BookImage extends JPanel{
	private BufferedImage image;
	
	public BookImage(String imageName){
		
		try {
			image = ImageIO.read(new File("/home/jesusrr/projects/ProjectLibrary/Images/"+imageName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(image!=null) {
			g.drawImage(image,0, 0, this);
		}
		
	}
	
}
