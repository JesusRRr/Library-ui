package com.hcl.library.templates;

import java.awt.GridBagConstraints;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class PanelTemplate extends JPanel{
	public GridBagConstraints constraints;
	
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
	
}
