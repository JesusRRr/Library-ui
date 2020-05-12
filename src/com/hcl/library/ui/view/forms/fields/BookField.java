package com.hcl.library.ui.view.forms.fields;

import com.hcl.library.model.enums.StatusBook;

@SuppressWarnings("serial")
public class BookField extends EntityField{
	
	public BookField(String field, int size) {
		super(field,size);
		
	}
	
	public StatusBook getBookStatusInput() {
		String status=entityInputField.getText();
		return StatusBook.valueOf(status);
	}
}
