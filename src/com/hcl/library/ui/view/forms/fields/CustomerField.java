package com.hcl.library.ui.view.forms.fields;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class CustomerField extends EntityField{
	
	public CustomerField(String field, int size) {
		super(field,size);
	}
	
	public Date getInputAsDate() {
		String birhday=entityInputField.getText();
		try {
			return new SimpleDateFormat("dd/MM/yyyy")
				.parse(birhday);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
			
		}
	}
}
