package com.hcl.library.ui.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.hcl.library.exceptions.InvalidFieldException;
import com.hcl.library.model.bo.BookBO;
import com.hcl.library.service.BookService;
import com.hcl.library.ui.buttons.AuthorButtonField;

@SuppressWarnings("serial")
public class BookFormView extends EntityFormView{
	private JButton submitButton;
	private List<String> fields;
	private AuthorButtonField authorbutton;
	private JPanel submitPanel;
	
	public BookFormView() {
		initComponents();
	}
	
	private void initComponents() {
		fields =Arrays.asList
			(
				"Name",
				"isbn",
				"Edition",
				"Editorial",
				"Category",
				"Language",
				"Bookcover",
				"Status"
			);
		
		List<EntityField> FieldObjects = new ArrayList<>();
		for(String field: fields) {
			EntityField fieldObject=new EntityField(field);
			FieldObjects.add(fieldObject);
			getPanel().add(fieldObject);
		}
		authorbutton=new AuthorButtonField();
		submitButton=new JButton("Submit");
		submitPanel=new JPanel();
		submitPanel.add(submitButton);
		
		getPanel().add(authorbutton);
		getPanel().add(submitPanel);
		getPanel().setLayout(new GridLayout(getPanel().getComponentCount(),1));
		getPanel().setSize(500, getPanel().getComponentCount()*60);
		
		
		ActionListener saveBook=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BookBO book = new BookBO();
				book.setName(FieldObjects.get(0).getInput());
				book.setIsbn(FieldObjects.get(1).getInput());
				book.setEdition(FieldObjects.get(2).getInput());
				book.setEditorial(FieldObjects.get(3).getInput());
				book.setCategory(FieldObjects.get(4).getInput());
				book.setLanguage(FieldObjects.get(5).getInput());
				book.setBookcover(FieldObjects.get(6).getInput());
				//book.setStatus(FieldObjects.get(7).getInput());
				
				try {
					BookService.getInstance().createBook(book);
				} catch (InvalidFieldException e1) {
					e1.printStackTrace();
				}
			}
		};
				
		submitButton.addActionListener(saveBook);
	}

}
