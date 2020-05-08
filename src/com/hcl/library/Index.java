package com.hcl.library;

import com.hcl.library.ui.view.BookView;
import com.hcl.library.ui.view.MainView;
import com.hcl.library.ui.view.TablesView;
import com.hcl.library.ui.view.forms.BookFormView;

public class Index {
	public static void main(String[] args) {
		//new TablesView().setVisible(true);
		//new BookFormView().setVisible(false);
		//new BookView().setVisible(false);
		new MainView().setVisible(true);
	}
}
