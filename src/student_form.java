import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class student_form {
	int tempId = 1010;
	String firstName = "Jane";
	String lastName = "Bedina";
	String address = "Bulacan";
	int gender = 1;
	String tempGender;
	long phoneNumber = 1234567890;
	Student studentObj = new Student(tempId, firstName, lastName, gender, address, phoneNumber);
	int index2 = 0;
	int repeatedModuleCount = 0;
	String[] moduleList = studentObj.getModuleList();
	String[] selectedModules = new String[6];
	String temp;
	

	private JFrame frame;
	private JTextField repeatedModulesField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField phoneNumberField;
	private JTextField addressField;
	private JTextField idNumField;

	/**
	 * Launch the application.
	 */
	public static void JavaSwingStudentScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student_form window = new student_form();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public student_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setOpacity(1.0f);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("ABC College Financial Management");
		frame.setBounds(100, 100, 600, 500);
		frame.getContentPane().setLayout(null);
		
		//Model
		DefaultListModel dm = new DefaultListModel();
		//DefaultListModel dm1 = new DefaultListModel();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 205, 439);
		frame.getContentPane().add(scrollPane);
		
		JList listofModules = new JList(moduleList);
		scrollPane.setViewportView(listofModules);
		//listofModules.setModel(dm1);		
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(485, 427, 89, 23);
		frame.getContentPane().add(btnReturn);
		
		JList listofSelectedModules = new JList(selectedModules);
		listofSelectedModules.setBounds(272, 12, 189, 177);
		frame.getContentPane().add(listofSelectedModules);
		listofSelectedModules.setModel(dm);
		
		JButton addButton = new JButton(">");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    int index = listofModules.getSelectedIndex();

			    temp = (String) listofModules.getSelectedValue();
			    boolean moduleExist = false;
			    
				for (int x = 0; x < 6; x++) 
				{
					if (temp.equals(selectedModules[x]))
					{
						moduleExist = true;
						System.out.println("Module Exists Fired");
					}
				}
				
			    if(index >= 0 && index <= studentObj.getModuleList().length && selectedModules[5] == null && !moduleExist)
			    {
			    	dm.addElement(temp);
			    	selectedModules[index2] = moduleList[index];
			    	index2++;
			    	for (int x = 0; x < 6; x++)
			    		System.out.println(selectedModules[x]);
			    }
			    
			    /* Constraints
			     * Modules must be less than or equal to 6 but not less than 1
			     * If Repeated Modules is greater than 2, no new modules is allowed
			     * If repeated modules is less than 2, user can add up to 6 total modules inclusive of the repeated modules
			     */
			}
		});
		
		addButton.setBounds(221, 66, 41, 23);
		frame.getContentPane().add(addButton);
		
		JButton removeButton = new JButton("<");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = listofSelectedModules.getSelectedIndex();
				if (index >= 0 && index <= selectedModules.length && listofSelectedModules != null)
				{
					index2--;
					temp = (String) dm.getElementAt(index);
					dm.removeElementAt(index);
					
					for (int x = 0; x < 6; x++) 
					{
						if (temp.equals(selectedModules[x]))
						{
							selectedModules[x] = null;
							System.out.println("Delete Module Fired");
						}
					}
					
			    	for (int x = 0; x < 6; x++)
			    		System.out.println(selectedModules[x]);
				}
			}
		});
		removeButton.setBounds(221, 100, 41, 23);
		frame.getContentPane().add(removeButton);
		
		
		addButton.setEnabled(false); //initially disable the button for adding
		removeButton.setEnabled(false); //initially disable the button for removing
		
		
		repeatedModulesField = new JTextField();
		repeatedModulesField.setBounds(471, 43, 103, 20);
		frame.getContentPane().add(repeatedModulesField);
		repeatedModulesField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("No. of Repeat Modules");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel.setBounds(471, 24, 103, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton repeatModuleSubmitButton = new JButton("Enter");
		repeatModuleSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempInt = Integer.parseInt(repeatedModulesField.getText());
				repeatedModuleCount = tempInt;
				if (tempInt <= 6 && tempInt > 0)
				{
					addButton.setEnabled(true);
					removeButton.setEnabled(true);
					repeatModuleSubmitButton.setEnabled(false);	
				}
			}
		});
		repeatModuleSubmitButton.setBounds(497, 66, 77, 23);
		frame.getContentPane().add(repeatModuleSubmitButton);
		
		firstNameField = new JTextField();
		firstNameField.setBounds(272, 229, 189, 20);
		frame.getContentPane().add(firstNameField);
		firstNameField.setColumns(10);
		
		lastNameField = new JTextField();
		lastNameField.setColumns(10);
		lastNameField.setBounds(272, 268, 189, 20);
		frame.getContentPane().add(lastNameField);
		
		JComboBox genderField = new JComboBox();
		genderField.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		genderField.setBounds(371, 306, 89, 22);
		frame.getContentPane().add(genderField);
		
		phoneNumberField = new JTextField();
		phoneNumberField.setBounds(272, 350, 189, 20);
		frame.getContentPane().add(phoneNumberField);
		phoneNumberField.setColumns(10);
		
		addressField = new JTextField();
		addressField.setColumns(10);
		addressField.setBounds(272, 386, 189, 20);
		frame.getContentPane().add(addressField);
		
		idNumField = new JTextField();
		idNumField.setColumns(10);
		idNumField.setBounds(480, 229, 94, 20);
		frame.getContentPane().add(idNumField);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(272, 214, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setBounds(272, 253, 77, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sex");
		lblNewLabel_1_2.setBounds(272, 310, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone Number");
		lblNewLabel_1_3.setBounds(272, 335, 111, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address");
		lblNewLabel_1_4.setBounds(272, 371, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("ID Number");
		lblNewLabel_1_5.setBounds(482, 214, 59, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get the value of all the text fields and set it to the variables
				firstName = firstNameField.getText();
				lastName = lastNameField.getText();
				tempId = Integer.parseInt(idNumField.getText());
				address = addressField.getText();
				phoneNumber = Long.parseLong(phoneNumberField.getText());
				tempGender = (String) genderField.getSelectedItem();
				
				if (tempGender.equals("Male"))
				{
					gender = 0;
				}
				else if (tempGender.equals("Female"))
				{
					gender = 1;
				}
				
				//update student obj
				studentObj.setID(tempId);
				studentObj.setFirstName(firstName);
				studentObj.setLastName(lastName);
				studentObj.setAddress(address);
				studentObj.setGender(gender);
				studentObj.setPhoneNumber(phoneNumber);
			}
		});
		btnSubmit.setBounds(485, 403, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		btnSubmit.setEnabled(false); //initially set the submit button to unclickable
		
		JButton checkDetailsButton = new JButton("Check Details");
		checkDetailsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstNameField.getText().equals("") && lastNameField.getText().equals("") && phoneNumberField.getText().equals("") && addressField.getText().equals("") && idNumField.getText().equals("")) 
				{
					btnSubmit.setEnabled(false);
				}
				else
				{
					btnSubmit.setEnabled(true);
				}
			}
		});
		checkDetailsButton.setBounds(343, 417, 118, 23);
		frame.getContentPane().add(checkDetailsButton);
		
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Main javaswingmain = new Main(); //initialize
				javaswingmain.main(null); // call
				frame.dispose(); // close
			}
		});

	}
}
