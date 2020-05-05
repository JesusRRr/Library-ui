package com.hcl.library;

import com.hcl.library.ui.view.BookFormView;
import com.hcl.library.ui.view.BookView;
import com.hcl.library.ui.view.TablesView;

public class Index {
	public static void main(String[] args) {
		new TablesView().setVisible(false);
		new BookFormView().setVisible(false);
		new BookView().setVisible(true);
	}
}
