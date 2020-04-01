package com.hcl.library;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class EntityTable extends JTable {
	private JScrollPane scrollBookTable;

	public EntityTable(DefaultTableModel bookTableModel) {

		this.setModel(bookTableModel);
		
		scrollBookTable = new JScrollPane(this, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		scrollBookTable.setBounds(25, 25, 750, 200);
	}

}
