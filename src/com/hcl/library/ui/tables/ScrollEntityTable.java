package com.hcl.library.ui.tables;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;


public class ScrollEntityTable extends JScrollPane{
	private JScrollPane scrollBookTable;

	public ScrollEntityTable(JTable entityTable){
		super(entityTable);
		this.setBounds(25, 25, 750, 300);
	}

}
