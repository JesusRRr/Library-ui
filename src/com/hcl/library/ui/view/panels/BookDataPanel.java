package com.hcl.library.ui.view.panels;

import java.awt.GridLayout;
import java.util.List;

import com.hcl.library.model.bo.AuthorBO;
import com.hcl.library.model.bo.BookBO;
import com.hcl.library.templates.PanelTemplate;
import com.hcl.library.ui.view.FieldPanel;

@SuppressWarnings("serial")
public class BookDataPanel extends PanelTemplate{
	private BookBO book;
	private FieldPanel isbn;
	private FieldPanel edition;
	private FieldPanel editorial;
	private FieldPanel category;
	private FieldPanel language;
	private FieldPanel status;
	private FieldPanel authors;
	
	public BookDataPanel(BookBO book) {
		this.book=book;
		this.setLayout(new GridLayout(7,1));
		initComponents();
	}

	@Override
	protected void initComponents() {
	
		isbn=new FieldPanel("isbn: "+book.getIsbn());
		editorial=new FieldPanel("Editorial: "+book.getEditorial());
		edition=new FieldPanel("Edition: "+book.getEdition());
		category=new FieldPanel("Category: "+book.getCategory());
		language=new FieldPanel("Language: "+book.getLanguage());
		status=new FieldPanel("Status: "+book.getStatus().toString());
		
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
		addComponents();
	}

	@Override
	protected void addComponents() {
		this.add(isbn);
		this.add(editorial);
		this.add(edition);
		this.add(category);
		this.add(language);
		this.add(status);
		this.add(authors);
	}

}
