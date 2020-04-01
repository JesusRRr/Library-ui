package com.hcl.library;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;


public class ScrollEntityTable {
	private JScrollPane scrollBookTable;

	public ScrollEntityTable(JTable entityTable) {
		
		scrollBookTable = new JScrollPane(entityTable, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		scrollBookTable.setBounds(25, 25, 750, 300);
	}
	
	public JScrollPane getScrollComponent() {
		return this.scrollBookTable;
	}

}
