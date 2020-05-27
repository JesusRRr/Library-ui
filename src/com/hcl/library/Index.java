package com.hcl.library;

import com.hcl.library.ui.view.BookView;
import com.hcl.library.ui.view.MainView;
import com.hcl.library.ui.view.TablesView;
import com.hcl.library.ui.view.Register;
import com.hcl.library.ui.view.forms.BookFormView;
import com.hcl.library.ui.view.in.Login;

public class Index {
	public static void main(String[] args) {
		//new TablesView().setVisible(true);
		//new BookFormView().setVisible(false);
		//new BookView().setVisible(false);
		//new MainView().setVisible(true);
		new Register().setVisible(true);
		//new FramePrueba().setVisible(true);
	}
}
