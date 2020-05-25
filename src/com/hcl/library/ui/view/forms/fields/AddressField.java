package com.hcl.library.ui.view.forms.fields;

@SuppressWarnings("serial")
public class AddressField extends EntityField{

	public AddressField(String field, int labelSize, int inputSize) {
		super(field, labelSize,inputSize);
		
	}
	
	public int getInputAsInt() {
		try {
			return Integer.parseInt(entityInputField.getText());	
		}catch(NumberFormatException e) {
			return 0;
		}
	}
	
}
