package com.hcl.library.templates;

import java.awt.Component;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class PanelTemplate extends JPanel{
	public GridBagConstraints constraints;
	private int heigth=0;
	private int padding=4;
	
	public PanelTemplate() {
		constraints=new GridBagConstraints();
	}

	protected abstract void initComponents();
	
	protected abstract void addComponents();
	
	protected GridBagConstraints setConstraints(int x, int y, int width, int height) {
		constraints.gridx =x;
		constraints.gridy=y;
		constraints.gridwidth=width;
		constraints.gridheight=height;
		return constraints;
	}
	
	protected void setPlace(Component component, HorizontalPosition position) {
		int componentWidth=component.getWidth();
		int panelWidth=this.getWidth();
		
		switch(position.toString()) {
		
		case "CENTER":
			component.setLocation((panelWidth-componentWidth)/2, heigth);
			heigth=component.getHeight()+heigth+padding;
			
			break;
		
		case "RIGHT":
			component.setLocation((panelWidth-componentWidth), heigth);
			
			heigth=component.getHeight()+heigth+padding;
			break;
			
		case "LEFT":
			
			component.setLocation(0, heigth);
			heigth=component.getHeight()+heigth+padding;
			break;
	
		}
			
				
		
		
	}
	
	
}
