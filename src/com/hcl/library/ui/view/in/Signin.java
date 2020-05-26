package com.hcl.library.ui.view.in;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.hcl.library.model.bo.StaffBO;
import com.hcl.library.service.StaffService;
import com.hcl.library.templates.HorizontalPosition;
import com.hcl.library.templates.PanelTemplate;
import com.hcl.library.ui.view.forms.fields.EntityField;
import com.hcl.library.ui.view.forms.fields.PasswordField;

@SuppressWarnings("serial")
public class Signin extends PanelTemplate{
	private StaffBO staff;
	private JLabel title;
	private EntityField name;
	private EntityField lastName;
	private EntityField curp;
	private EntityField user;
	private PasswordField password;
	private PasswordField confirmPassword;
	private JButton submitButton;

	public Signin() {
		this.setSize(500,280);
		this.setLayout(null);
		initComponents();
	}
	
	@Override
	protected void initComponents() {
		staff=new StaffBO();
		title = new JLabel("Sign-in");
		title.setSize(100, 30);
		name = new EntityField("Name", 100,150);
		lastName= new EntityField("Last name", 100,150);
		user= new EntityField("User", 100,150);
		curp=new EntityField("Curp", 100,150);
		password= new PasswordField("Password", 100,150);
		confirmPassword= new PasswordField("Confirm", 100,150);
		submitButton=new JButton("Sign-in");
		submitButton.setSize(100, 30);
		addComponents();
		
		ActionListener sigin = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				staff.setName(name.getInput());
				staff.setLastName(lastName.getInput());
				staff.setUserName(user.getInput());
				staff.setCurp(curp.getInput());
				if(confirmPassword(password.getInput(),confirmPassword.getInput())) {
					staff.setPassword(password.getInput());
					
					StaffService.getInstance().saveStaff(staff);
					JOptionPane.showMessageDialog(null,staff.getName()+" registered");

					cleanFields();
				}else {
					JOptionPane.showMessageDialog(null,"Password doesn't match");
					cleanPassword();
				}
			}
		};
		
		submitButton.addActionListener(sigin);
	}

	@Override
	protected void addComponents() {
		this.add(title);
		this.add(name);
		this.add(lastName);
		this.add(curp);
		this.add(user);
		this.add(password);
		this.add(confirmPassword);
		this.add(submitButton);
		
		for(Component component : this.getComponents()) {
			this.setPlace(component, HorizontalPosition.CENTER);
		}
		
	}
	
	public boolean confirmPassword(String password, String confirm) {
		System.out.println(password+" "+confirm);
		if(password.equals("")){
			
			return false;
		}else if(!password.equals(confirm)) {
			return false;
		}else {
			return true;
		}
	}
	
	public void cleanFields() {
		name.setInput("");
		lastName.setInput("");
		user.setInput("");
		curp.setInput("");
		cleanPassword();
		
	}
	
	public void cleanPassword() {
		password.setInput("");
		confirmPassword.setInput("");
	}
}
