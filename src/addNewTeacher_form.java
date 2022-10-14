import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class addNewTeacher_form {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void addnewteacher_form(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addNewTeacher_form window = new addNewTeacher_form();
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
	public addNewTeacher_form() {
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
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(108, 117, 125));
		textField.setBounds(10, 64, 195, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(499, 63, 75, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Business", "Computing"}));
		comboBox_1.setBounds(97, 163, 108, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"HOF", "CO", "L"}));
		comboBox_1_1.setBounds(302, 163, 108, 22);
		frame.getContentPane().add(comboBox_1_1);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(486, 257, 88, 23);
		frame.getContentPane().add(btnReturn);
		
		JButton btnNewButton = new JButton("GENERATE ID");
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBounds(466, 109, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(108, 117, 125));
		textField_4.setForeground(new Color(255, 255, 255));
		textField_4.setColumns(10);
		textField_4.setBounds(466, 143, 108, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblSex = new JLabel("Sex", SwingConstants.CENTER);
		lblSex.setForeground(new Color(248, 249, 250));
		lblSex.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblSex.setBounds(443, 67, 57, 14);
		frame.getContentPane().add(lblSex);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(248, 249, 250));
		lblFirstName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblFirstName.setBounds(10, 43, 86, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(248, 249, 250));
		lblLastName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblLastName.setBounds(215, 43, 86, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(248, 249, 250));
		lblAddress.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblAddress.setBounds(215, 95, 86, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(new Color(248, 249, 250));
		lblPhoneNumber.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblPhoneNumber.setBounds(10, 95, 86, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(new Color(248, 249, 250));
		lblDepartment.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblDepartment.setBounds(10, 167, 86, 14);
		frame.getContentPane().add(lblDepartment);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setForeground(new Color(248, 249, 250));
		lblDesignation.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblDesignation.setBounds(215, 167, 86, 14);
		frame.getContentPane().add(lblDesignation);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(108, 117, 125));
		textField_5.setForeground(new Color(255, 255, 255));
		textField_5.setColumns(10);
		textField_5.setBounds(302, 210, 108, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNoOfTeaching = new JLabel("No. of teaching hours");
		lblNoOfTeaching.setForeground(new Color(248, 249, 250));
		lblNoOfTeaching.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblNoOfTeaching.setBounds(162, 213, 139, 14);
		frame.getContentPane().add(lblNoOfTeaching);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(108, 117, 125));
		textField_1.setBounds(215, 64, 195, 20);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(108, 117, 125));
		textField_3.setBounds(215, 107, 195, 20);
		frame.getContentPane().add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(108, 117, 125));
		textField_2.setBounds(10, 107, 195, 20);
		frame.getContentPane().add(textField_2);
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Teacher_form teacherform = new Teacher_form();
				teacherform.teacher_form(null);
				frame.dispose();
			}
		});
	}
}
