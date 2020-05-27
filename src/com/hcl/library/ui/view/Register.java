package com.hcl.library.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import com.hcl.library.StaffLogged;
import com.hcl.library.model.bo.StaffBO;
import com.hcl.library.service.StaffService;
import com.hcl.library.ui.view.forms.fields.EntityField;
import com.hcl.library.ui.view.forms.fields.PasswordField;
import com.hcl.library.ui.view.in.RegisterPanel;
import com.sun.glass.events.WindowEvent;

@SuppressWarnings("serial")
public class Register extends JFrame{
	private StaffBO staff;
	private RegisterPanel register;
	private JButton loginButton;
	private EntityField user;
	private PasswordField password;
	
	public Register() {
		this.setLayout(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		initComponents();
	}
	
	private void initComponents() {
		register= new RegisterPanel();
		user= register.getLogin().getUser();
		password = register.getLogin().getPassword();
		addComponents();
		loginButton=register.getLogin().getSubmitButton();
		
		ActionListener login = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				staff=StaffService.getInstance().findByUserName(user.getInput());
				if(staff!=null) {
					if(StaffService.getInstance().checkPassword(user.getInput(),password.getInput() )){
						StaffLogged.setStaff(staff);
						new MainView().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "password incorrect");
					}
				}else {
					JOptionPane.showMessageDialog(null, "user not found");
				}
			}
		};
		
		loginButton.addActionListener(login);
	}
	
	private void addComponents() {
		this.add(register);
		this.setSize(register.getWidth(),register.getHeight());
	}
}
