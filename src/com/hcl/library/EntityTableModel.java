package com.hcl.library;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public abstract class EntityTableModel extends DefaultTableModel{
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}

}
