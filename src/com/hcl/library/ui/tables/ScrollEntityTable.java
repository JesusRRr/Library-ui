package com.hcl.library.ui.tables;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;


@SuppressWarnings("serial")
public class EntityTable extends JScrollPane{
	private JScrollPane scrollBookTable;

	public EntityTable(JTable entityTable){
		super(entityTable);
		this.setBounds(25, 25, 750, 300);
	}

}
