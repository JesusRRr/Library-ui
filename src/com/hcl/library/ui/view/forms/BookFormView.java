package com.hcl.library.ui.view.forms;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.hcl.library.model.bo.BookBO;
import com.hcl.library.service.BookService;
import com.hcl.library.ui.view.fields.BookField;

@SuppressWarnings("serial")
public class BookFormView extends EntityFormView{
	private JButton submitButton;
	private List<String> fields;
	private List<BookField> bookFields;
	private AuthorFieldSeccion authorFieldsPanel;
	
	private JPanel submitPanel;
	
	public BookFormView() {
		initComponents();
	}
	
	private void initComponents() {
		this.setTitle("Book Form");
		BookBO book = new BookBO();
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
		
		bookFields = new ArrayList<>();
		
		submitButton=new JButton("Submit");
		submitPanel=new JPanel();
		authorFieldsPanel= new AuthorFieldSeccion();
		
		ActionListener saveBook=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				book.setName(bookFields.get(0).getInput());
				book.setIsbn(bookFields.get(1).getInput());
				book.setEdition(bookFields.get(2).getInput());
				book.setEditorial(bookFields.get(3).getInput());
				book.setCategory(bookFields.get(4).getInput());
				book.setLanguage(bookFields.get(5).getInput());
				book.setBookcover(bookFields.get(6).getInput());
				book.setStatus(bookFields.get(7).getBookStatusInput());
				book.setAuthors(authorFieldsPanel.getAuthors());
				try {
					BookService.getInstance().createBook(book);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		};
				
		submitButton.addActionListener(saveBook);
		addComponents();
	}
	
	private void addComponents() {
		
		for(String field: fields) {
			BookField bookfield=new BookField(field,30);
			bookFields.add(bookfield);
			getPanel().add(bookfield);
		}
		submitPanel.add(submitButton);
		getPanel().add(authorFieldsPanel.getInputPanel());
		getPanel().add(authorFieldsPanel.getTablePanel());
		getPanel().add(submitPanel);
		getPanel().setLayout(new GridLayout(getPanel().getComponentCount(),1));
		getPanel().setSize(650, getPanel().getComponentCount()*50);
		getFrame().setSize(700, getPanel().getComponentCount()*55);
	}

}
