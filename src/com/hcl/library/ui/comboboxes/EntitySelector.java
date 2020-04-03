package com.hcl.library.ui.comboboxes;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class EntitySelector extends JComboBox<String>{
	
	public void choseEntity() {
		this.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println(getSelectedItem());
				}
			}
			
		});
		
	}
}

