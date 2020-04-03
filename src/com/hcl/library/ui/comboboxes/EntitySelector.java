package com.hcl.library.ui.comboboxes;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class EntitySelector extends JComboBox<String>{
	private String entity;
	
	public EntitySelector() {
		entity="book";
	}
	
	public String choseEntity() {
		
		this.addItemListener(new ItemListener() {
		
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					entity=getSelectedItem().toString();
					System.out.println(entity);
					
				}
			}
			
		});
		
		return entity;
	}
}

