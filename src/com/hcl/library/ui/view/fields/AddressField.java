package com.hcl.library.ui.view.fields;

@SuppressWarnings("serial")
public class AddressField extends EntityField{

	public AddressField(String field, int size) {
		super(field, size);
		
	}
	
	public int getInputAsInt() {
		try {
			return Integer.parseInt(entityInputField.getText());	
		}catch(NumberFormatException e) {
			return 0;
		}
	}
	
}
