import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;


public class remainingBalanceStudent_form {

	Accounting database = new Accounting();
	
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public remainingBalanceStudent_form(Accounting db) {
		EventQueue.invokeLater(() -> {
			try {
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(33, 37, 41));
		frame.setBackground(new Color(33, 37, 41));
		frame.setResizable(false);
		frame.setBounds(100, 100, 584, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter Student ID");
		lblNewLabel.setForeground(new Color(248, 249, 250));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(86, 124, 141, 33);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(205, 127, 308, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnCheck.setBounds(249, 158, 89, 23);
		frame.getContentPane().add(btnCheck);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(486, 11, 88, 23);
		frame.getContentPane().add(btnReturn);

		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student_form studentform = new Student_form(db);
				frame.dispose();
			}
		});
		
		btnCheck.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//JOptionPane.showMessageDialog(null, database.getBalance());
				database.displayStudentList();
			}
		});
	}

}
