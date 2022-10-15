import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class updateStudent_form {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private String row[][] = new String[9][9];
	private String column[] = {"ID", "First Name", "Last Name", "Gender", "Phone Number", "Address", "No. of Modules", "No. of Repeated Modules", "No. of New Modules"};
	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public updateStudent_form(Accounting db) {

		EventQueue.invokeLater(() -> {
			try {
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(33, 37, 41));
		frame.setBackground(new Color(33, 37, 41));
		frame.setResizable(false);
		frame.setBounds(100, 100, 731, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField.setBackground(new Color(108, 117, 125));
		textField.setBounds(175, 71, 419, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "First Name", "Last Name", "Phone Number", "Sex"}));
		comboBox.setBounds(61, 70, 97, 22);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel = new JLabel("Search User by:");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(249, 248, 250));
		lblNewLabel.setBounds(38, 55, 102, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBounds(604, 70, 81, 23);
		frame.getContentPane().add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 114, 711, 305);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(row, column);
		scrollPane.setViewportView(table);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(633, 11, 88, 23);
		frame.getContentPane().add(btnReturn);

		btnReturn.addActionListener(e -> {
			Student_form studentform = new Student_form(db);
			frame.dispose();
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
}
