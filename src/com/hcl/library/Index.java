package com.hcl.library;

import com.hcl.library.ui.view.BookEntityView;
import com.hcl.library.ui.view.EntityFormView;
import com.hcl.library.ui.view.TablesView;

public class Index {
	public static void main(String[] args) {
		new TablesView().setVisible(false);
		new BookEntityView().setVisible(true);
	}
}
