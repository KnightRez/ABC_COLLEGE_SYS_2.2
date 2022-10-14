import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class computeTeacher_form {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void computeteacher_form(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					computeTeacher_form window = new computeTeacher_form();
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
	public computeTeacher_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(33, 37, 41));
		frame.setBackground(new Color(33, 37, 41));
		frame.setResizable(false);
		frame.setBounds(100, 100, 584, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter ID", SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 64, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(108, 117, 125));
		textField.setBounds(84, 10, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBounds(180, 9, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(108, 117, 125));
		textField_1.setBounds(10, 102, 195, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(108, 117, 125));
		textField_2.setBounds(215, 102, 195, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(108, 117, 125));
		textField_3.setBounds(10, 164, 195, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.WHITE);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(108, 117, 125));
		textField_4.setBounds(215, 164, 195, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.WHITE);
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(108, 117, 125));
		textField_5.setBounds(469, 102, 105, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.WHITE);
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(108, 117, 125));
		textField_6.setBounds(469, 164, 105, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.WHITE);
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(108, 117, 125));
		textField_7.setBounds(469, 222, 105, 20);
		frame.getContentPane().add(textField_7);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(486, 9, 88, 23);
		frame.getContentPane().add(btnReturn);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(248, 249, 250));
		lblFirstName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblFirstName.setBounds(10, 83, 86, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(248, 249, 250));
		lblLastName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblLastName.setBounds(215, 83, 86, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(248, 249, 250));
		lblAddress.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblAddress.setBounds(215, 145, 86, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(new Color(248, 249, 250));
		lblPhoneNumber.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblPhoneNumber.setBounds(10, 145, 86, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setForeground(new Color(248, 249, 250));
		lblDesignation.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblDesignation.setBounds(469, 145, 86, 14);
		frame.getContentPane().add(lblDesignation);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(new Color(248, 249, 250));
		lblDepartment.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblDepartment.setBounds(469, 205, 86, 14);
		frame.getContentPane().add(lblDepartment);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setForeground(new Color(248, 249, 250));
		lblSex.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblSex.setBounds(469, 83, 57, 14);
		frame.getContentPane().add(lblSex);
		
		textField_8 = new JTextField();
		textField_8.setForeground(Color.WHITE);
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(108, 117, 125));
		textField_8.setBounds(215, 222, 195, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setForeground(new Color(248, 249, 250));
		lblSalary.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblSalary.setBounds(215, 202, 86, 14);
		frame.getContentPane().add(lblSalary);
	}

}
