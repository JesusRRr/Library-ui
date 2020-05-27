package com.hcl.library.ui.view;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hcl.library.model.bo.AuthorBO;
import com.hcl.library.model.bo.BookBO;
import com.hcl.library.model.po.AuthorPO;
import com.hcl.library.model.po.BookPO;

@SuppressWarnings("serial")
public class BookView extends JFrame{
	private JPanel mainPanel;
	private BookImage imagePanel;
	private JPanel titlePanel;
	private JPanel dataPanel;
	private JLabel title;
	private BookBO book;
	private LoanButtonPanel loanButtonPanel;
	
	private FieldPanel isbn;
	private FieldPanel edition;
	private FieldPanel editorial;
	private FieldPanel category;
	private FieldPanel language;
	private FieldPanel status;
	private FieldPanel authors;

	public BookView(BookBO book) {
		this.setSize(800,620);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Books");
		this.book=book;
		initComponents();
	}
	
	private void initComponents() {
		titlePanel=new JPanel();
		mainPanel=new JPanel(null);
		imagePanel=new BookImage(book.getName());
		dataPanel=new JPanel(new GridLayout(7,1));
		isbn=new FieldPanel("isbn: "+book.getIsbn());
		editorial=new FieldPanel("Editorial: "+book.getEditorial());
		edition=new FieldPanel("Edition: "+book.getEdition());
		category=new FieldPanel("Category: "+book.getCategory());
		language=new FieldPanel("Language: "+book.getLanguage());
		status=new FieldPanel("Status: "+book.getStatus().toString());
		loanButtonPanel= new LoanButtonPanel();
		
		List<AuthorBO> auhtorlist = book.getAuthors();
		StringBuilder authorsString=new StringBuilder();
		for(int i=0;i<auhtorlist.size();i++){
			authorsString.append(auhtorlist.get(i).getName())
			.append(" ")
			.append(auhtorlist.get(i).getLastName());
			
			if(i<auhtorlist.size()-1) {
				authorsString.append(", ");
			}
		}
		authors=new FieldPanel("Author: "+ authorsString.toString());
		
		title=new JLabel(book.getName());
		mainPanel.setSize(800, 600);
		this.add(mainPanel);
	
		titlePanel.setSize(800, 100);
		title.setFont(title.getFont().deriveFont(28.0f));
		titlePanel.add(title);
		
		imagePanel.setSize(200,300);
		imagePanel.setLocation(0, 100);
		
		loanButtonPanel.setSize(200,200);
		loanButtonPanel.setLocation(0, 400);
		
		dataPanel.setSize(600, 500);
		dataPanel.setLocation(200, 100);
		dataPanel.add(isbn);
		dataPanel.add(editorial);
		dataPanel.add(edition);
		dataPanel.add(category);
		dataPanel.add(language);
		dataPanel.add(status);
		dataPanel.add(authors);
		
		mainPanel.add(titlePanel);
		mainPanel.add(imagePanel);
		mainPanel.add(dataPanel);
		mainPanel.add(loanButtonPanel);
	}
	
	
}
