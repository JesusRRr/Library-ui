package com.hcl.library.ui.view.forms.fields;

import com.hcl.library.model.enums.StatusBook;

@SuppressWarnings("serial")
public class BookField extends EntityField{
	
	public BookField(String field, int labelSize, int inputSize) {
		super(field, labelSize,inputSize);
		
	}
	
	public StatusBook getBookStatusInput() {
		String status=entityInputField.getText();
		return StatusBook.valueOf(status);
	}
}
