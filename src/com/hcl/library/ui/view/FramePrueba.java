package com.hcl.library.ui.view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import com.hcl.library.ui.view.forms.fields.EntityField;

@SuppressWarnings("serial")
public class FramePrueba extends JFrame{
	private EntityField field;
	private EntityField field2;
	
	public FramePrueba() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000,800);
		field=new EntityField("holacvcvcvcvcvccv", 10);
		field2=new EntityField("hola", 10);
		this.add(field).setLocation(0, 0);
		this.add(field2).setLocation(0, 26);
	}
}
