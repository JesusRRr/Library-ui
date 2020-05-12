package com.hcl.library.ui.view.forms.seccions;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JPanel;

import com.hcl.library.ui.view.forms.fields.AddressField;

@SuppressWarnings("serial")
public class AddressFieldSeccion extends JPanel{
	private List<AddressField> addressFields;
	private List<String> fields;
	
	
	public AddressFieldSeccion() {
		initComponents();
	}
	
	private void initComponents(){
		this.setLayout(new GridLayout(2,3));
		
		fields =Arrays.asList
				(
					"Number",
					"Street",
					"City",
					"State",
					"Country",
					"Postal Code"
				);
		addressFields=new ArrayList<>();
		
		addComponents();
	}
	
	private void addComponents() {
		for(String field: fields) {
			AddressField fieldObject=new AddressField(field,10);
			addressFields.add(fieldObject);
			this.add(fieldObject);
		}
	}
	
	
	
	public List<AddressField> getAddressField() {
		return addressFields;
	}
}
