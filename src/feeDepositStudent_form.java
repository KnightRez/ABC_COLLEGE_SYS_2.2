import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class feeDepositStudent_form {

	private JFrame frame;
	private JTextField amountTextField;
	private JTextField studentIDTextField;
	/**
	 * Launch the application.
	 */
	public static void feedepositstudent_form(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					feeDepositStudent_form window = new feeDepositStudent_form();
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
	public feeDepositStudent_form() {
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
		
		JLabel lblNewLabel = new JLabel("Enter Amount");
		lblNewLabel.setForeground(new Color(248, 249, 250));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(86, 132, 141, 33);
		frame.getContentPane().add(lblNewLabel);
		
		amountTextField = new JTextField();
		amountTextField.setBounds(205, 135, 308, 20);
		frame.getContentPane().add(amountTextField);
		amountTextField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnSubmit.setBounds(249, 166, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(486, 11, 88, 23);
		frame.getContentPane().add(btnReturn);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Student ID");
		lblNewLabel_1.setForeground(new Color(248, 249, 250));
		lblNewLabel_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(86, 94, 141, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		studentIDTextField = new JTextField();
		studentIDTextField.setColumns(10);
		studentIDTextField.setBounds(205, 97, 308, 20);
		frame.getContentPane().add(studentIDTextField);
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student_form studentform = new Student_form();
				studentform.student_form(null);
				frame.dispose();
			}
		});
	}

}
