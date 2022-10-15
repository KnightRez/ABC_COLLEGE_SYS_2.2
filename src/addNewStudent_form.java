import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class addNewStudent_form {

	private JFrame frame;
	private JTextField textField_ID;
	private JTextField textField_fName;
	private JTextField textField_lName;
	private JTextField textField_pNumber;
	private JTextField textField_address;
	private JTextField textField_repeatedModules;
	private JTextField textField_newModules;
	
	private int _ID, _newModules, _repeatedModules, _maxModules = 6, _moduleLimit, index2 = 0;;
	private String _fName, _lName, _address, _gender,  _phoneNumber;
	private float _amountPaid;
	private String[] _selectedModules = new String[6];
	private boolean _moduleExists = false;
	
	Student _studentObj = new Student(_ID, _fName, _lName, _address, _gender, _phoneNumber, _newModules, _repeatedModules, _amountPaid, _selectedModules);
	Accounting database = new Accounting();
	
	private String[] _moduleList = _studentObj.getModuleNames();
	
	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public addNewStudent_form(Accounting db) {
		EventQueue.invokeLater(() -> {
			try {
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	/**
	 * Initialize the contents of the frame.
	 */
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(33, 37, 41));
		frame.setBackground(new Color(33, 37, 41));
		frame.setResizable(false);
		frame.setBounds(100, 100, 731, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DefaultListModel dm = new DefaultListModel();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 214, 408);
		frame.getContentPane().add(scrollPane);
		
		JList listOfModules = new JList(_moduleList);
		scrollPane.setViewportView(listOfModules);
		
		JList listOfSelectedModules = new JList(_selectedModules);
		listOfSelectedModules.setBounds(299, 11, 422, 114);
		frame.getContentPane().add(listOfSelectedModules);
		
		JButton btnAdd = new JButton(">");
		btnAdd.setBounds(232, 30, 57, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnRemove = new JButton("<");
		btnRemove.setBounds(232, 64, 57, 23);
		frame.getContentPane().add(btnRemove);
		
		JButton btnGenerateID = new JButton("GENERATE ID");
		btnGenerateID.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnGenerateID.setBounds(517, 334, 108, 23);
		frame.getContentPane().add(btnGenerateID);
		
		textField_ID = new JTextField();
		textField_ID.setBackground(new Color(108, 117, 125));
		textField_ID.setForeground(new Color(255, 255, 255));
		textField_ID.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField_ID.setBounds(635, 335, 86, 20);
		frame.getContentPane().add(textField_ID);
		textField_ID.setColumns(10);
		textField_ID.setEnabled(false);
		
		textField_fName = new JTextField();
		textField_fName.setBackground(new Color(108, 117, 125));
		textField_fName.setForeground(new Color(255, 255, 255));
		textField_fName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField_fName.setBounds(296, 233, 201, 20);
		frame.getContentPane().add(textField_fName);
		textField_fName.setColumns(10);
		
		textField_lName = new JTextField();
		textField_lName.setBackground(new Color(108, 117, 125));
		textField_lName.setForeground(new Color(255, 255, 255));
		textField_lName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField_lName.setColumns(10);
		textField_lName.setBounds(517, 233, 201, 20);
		frame.getContentPane().add(textField_lName);
		
		textField_pNumber = new JTextField();
		textField_pNumber.setBackground(new Color(108, 117, 125));
		textField_pNumber.setForeground(new Color(255, 255, 255));
		textField_pNumber.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField_pNumber.setColumns(10);
		textField_pNumber.setBounds(296, 283, 201, 20);
		frame.getContentPane().add(textField_pNumber);
		
		textField_address = new JTextField();
		textField_address.setBackground(new Color(108, 117, 125));
		textField_address.setForeground(new Color(255, 255, 255));
		textField_address.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField_address.setColumns(10);
		textField_address.setBounds(517, 283, 201, 20);
		frame.getContentPane().add(textField_address);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(423, 334, 74, 22);
		frame.getContentPane().add(comboBox);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblFirstName.setForeground(new Color(248, 249, 250));
		lblFirstName.setBounds(296, 215, 86, 14);
		frame.getContentPane().add(lblFirstName);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(new Color(248, 249, 250));
		lblPhoneNumber.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblPhoneNumber.setBounds(296, 264, 86, 14);
		frame.getContentPane().add(lblPhoneNumber);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(248, 249, 250));
		lblLastName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblLastName.setBounds(517, 212, 86, 14);
		frame.getContentPane().add(lblLastName);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(248, 249, 250));
		lblAddress.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblAddress.setBounds(517, 264, 86, 14);
		frame.getContentPane().add(lblAddress);

		JLabel lblSex = new JLabel("Sex", SwingConstants.CENTER);
		lblSex.setForeground(new Color(248, 249, 250));
		lblSex.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblSex.setBounds(356, 338, 57, 14);
		frame.getContentPane().add(lblSex);

		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(633, 396, 88, 23);
		frame.getContentPane().add(btnReturn);

		JButton btnCheckDetails = new JButton("Check Details");
		btnCheckDetails.setForeground(new Color(33, 37, 41));
		btnCheckDetails.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnCheckDetails.setBackground(new Color(248, 249, 250));
		btnCheckDetails.setBounds(299, 396, 123, 23);
		frame.getContentPane().add(btnCheckDetails);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(33, 37, 41));
		btnSubmit.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnSubmit.setBackground(new Color(248, 249, 250));
		btnSubmit.setBounds(432, 396, 88, 23);
		frame.getContentPane().add(btnSubmit);
		
		textField_repeatedModules = new JTextField();
		textField_repeatedModules.setBackground(new Color(108, 117, 125));
		textField_repeatedModules.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField_repeatedModules.setForeground(new Color(255, 255, 255));
		textField_repeatedModules.setBounds(299, 136, 44, 20);
		frame.getContentPane().add(textField_repeatedModules);
		textField_repeatedModules.setColumns(10);
		
		JButton btnEnterRepeatModules = new JButton("Enter Number of Repeat Modules");
		btnEnterRepeatModules.setForeground(new Color(33, 37, 41));
		btnEnterRepeatModules.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnEnterRepeatModules.setBackground(new Color(248, 249, 250));
		btnEnterRepeatModules.setBounds(351, 135, 232, 23);
		frame.getContentPane().add(btnEnterRepeatModules);
		
		btnRemove.setEnabled(false);
		btnAdd.setEnabled(false);
		btnSubmit.setEnabled(false);
		
		
		/**
		 * Action Listeners
		 */
		
		listOfSelectedModules.setModel(dm);
		
		textField_newModules = new JTextField();
		textField_newModules.setForeground(Color.WHITE);
		textField_newModules.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField_newModules.setColumns(10);
		textField_newModules.setBackground(new Color(108, 117, 125));
		textField_newModules.setBounds(299, 165, 44, 20);
		frame.getContentPane().add(textField_newModules);
		
		JButton btnEnterNewModules = new JButton("Enter Number of New Modules");
		btnEnterNewModules.setForeground(new Color(33, 37, 41));
		btnEnterNewModules.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnEnterNewModules.setBackground(new Color(248, 249, 250));
		btnEnterNewModules.setBounds(351, 164, 232, 23);
		frame.getContentPane().add(btnEnterNewModules);
		btnEnterNewModules.setEnabled(false);
		
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Student_form studentform = new Student_form(db);
				frame.dispose();
			}
		});
		
		btnAdd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int index = listOfModules.getSelectedIndex();
				
				for (int x = 0; x < _selectedModules.length; x++)
				{
					if (_moduleList[index].equals(_selectedModules[x]))
						_moduleExists = true;
				}
				
				if (_selectedModules[_moduleLimit-1] == null && !_moduleExists)
				{
					dm.addElement(_moduleList[index]);
					_selectedModules[index2] = _moduleList[index];
					index2++;
					for (int x = 0; x < _maxModules; x++)
			    		System.out.println(_selectedModules[x]);
				}
				
				_moduleExists = false;
			}
		});
		
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = listOfSelectedModules.getSelectedIndex();
				
				if (listOfSelectedModules != null)
				{	
					for (int x = 0; x < _maxModules; x++)
					{
						if (dm.getElementAt(index).equals(_selectedModules[x]))
						{
							_selectedModules[x] = null;
						}
					}
					dm.removeElementAt(index);
					index2--;
			    	for (int x = 0; x < 6; x++)
			    		System.out.println(_selectedModules[x]);
				}
			}
		});
		
		btnEnterRepeatModules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = listOfSelectedModules.getSelectedIndex();
				_repeatedModules = Integer.parseInt(textField_repeatedModules.getText());
				
				if (_repeatedModules <= _maxModules && _repeatedModules >= 0)
				{	
					if (_repeatedModules > 2)
					{
						_moduleLimit = _repeatedModules;
						_newModules = 0;
						btnRemove.setEnabled(true);
						btnAdd.setEnabled(true);
					}
					else 
					{
						btnEnterNewModules.setEnabled(true);
					}
				}
			}
		});
		
		btnEnterNewModules.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				_newModules = Integer.parseInt(textField_newModules.getText());
				
				if (_newModules + _repeatedModules <= 6 && _newModules + _repeatedModules > 0)
				{
					btnRemove.setEnabled(true);
					btnAdd.setEnabled(true);
					_moduleLimit = _repeatedModules + _newModules;
				}
			}
		});
		
		btnCheckDetails.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (!textField_ID.getText().equals("") && !textField_fName.getText().equals("") && !textField_lName.getText().equals("") && !textField_pNumber.getText().equals("") && !textField_address.getText().equals(""))
				{
					btnSubmit.setEnabled(true);
				}
				
			}
		});
		
		btnGenerateID.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				_studentObj.generateID();
				String tempID =  Integer.toString(_studentObj.getID());
				textField_ID.setText(tempID);
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() 
		{
			String tempGender = comboBox.getSelectedItem().toString();

			public void actionPerformed(ActionEvent e) 
			{
				/**
				 * Update the current Student Object's attributes
				 */
				_studentObj.setFirstName(textField_fName.getText());
				_studentObj.setLastName(textField_lName.getText());
				_studentObj.setAddress(textField_address.getText());
				_studentObj.setPhoneNumber(textField_pNumber.getText());
				_studentObj.setID(_studentObj.getID());
				_studentObj.setGender(tempGender);
				_studentObj.setNumberOfNewModules(_newModules);
				_studentObj.setNumberOfRepeatedModules(_repeatedModules);
				_studentObj.setNumberOfModules(_moduleLimit);
				_studentObj.setAmountPaid(0f);
				
				/**
				 * Compute the values in back-end
				 */
				_studentObj.computeTotalAmount();
				_studentObj.computeBalance();
				
				/**
				 * add student to the runtime database
				 */
				database.addStudent(_studentObj);
			}
		});
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
}
