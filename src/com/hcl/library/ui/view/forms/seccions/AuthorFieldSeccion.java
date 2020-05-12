package com.hcl.library.ui.view.forms.seccions;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import com.hcl.library.model.bo.AuthorBO;
import com.hcl.library.ui.tables.AuthorTableModel;
import com.hcl.library.ui.tables.ScrollEntityTable;

@SuppressWarnings("serial")
public class AuthorFieldSeccion extends JPanel{
	JPanel inputPanel;
	JPanel tablePanel;
	JLabel nameLabel;
	JTextField nameInput;
	JLabel lastNameLabel;
	JTextField lastNameInput;
	JLabel nationalityLabel;
	JTextField nationalityInput;
	JButton addAuthorButton;
	DefaultTableModel authorTableModel;
	JScrollPane scrollAuthorTable;
	JTable authorTable;
	JTable authorTable2;
	List<AuthorBO> authors;


	
	
	public AuthorFieldSeccion() {
		inputPanel=new JPanel();
		tablePanel=new JPanel(null);
		nameLabel=new JLabel("Name");
		nameInput=new JTextField("", 8);
		lastNameLabel=new JLabel("Lastname");
		lastNameInput=new JTextField("", 8);
		nationalityLabel=new JLabel("Nationality");
		nationalityInput=new JTextField("", 8);
		addAuthorButton=new JButton("+");
		authorTableModel = new DefaultTableModel();
		authorTable = new JTable(authorTableModel);
		scrollAuthorTable=new JScrollPane(authorTable);
		scrollAuthorTable.setBounds(80, 0, 500, 60);
		scrollAuthorTable.setVerticalScrollBarPolicy(22);
		authors=new ArrayList<>();

		authorTableModel.addColumn("Name");
		authorTableModel.addColumn("LastName");
		authorTableModel.addColumn("Nationality");

		
		inputPanel.add(nameLabel);
		inputPanel.add(nameInput);
		inputPanel.add(lastNameLabel);
		inputPanel.add(lastNameInput);
		inputPanel.add(nationalityLabel);
		inputPanel.add(nationalityInput);
		inputPanel.add(addAuthorButton);
		tablePanel.add(scrollAuthorTable);
		
		
		ActionListener addAuhtor=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] authorFields= {
						nameInput.getText(),
						lastNameInput.getText(),
						nationalityInput.getText()
						};
				
				if(!authorFields[0].equals("")) {
					authorTableModel.addRow(authorFields);
					AuthorBO author = new AuthorBO();
					author.setName(nameInput.getText());
					author.setLastName(lastNameInput.getText());
					author.setNacionality(nationalityInput.getText());
					authors.add(author);
				}
				
			}
			
		};
		
		addAuthorButton.addActionListener(addAuhtor);
		
	}
	
	public List<AuthorBO> getAuthors() {
		return authors;
	}
	
	public JPanel getInputPanel() {
		return inputPanel;
	}
	
	public JPanel getTablePanel() {
		return tablePanel;
	}
}
