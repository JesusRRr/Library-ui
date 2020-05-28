package com.hcl.library.ui.comboboxes;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

@SuppressWarnings("serial")
public class ComboBoxRender extends JLabel implements ListCellRenderer{
	private String title;
	
	public ComboBoxRender(String title) {
		this.title=title;
	}
	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		
		if(index == -1 && value==null) {
			setText(title);
		}else {
			setText(value.toString());
		}
		
		return this;
	}

}
