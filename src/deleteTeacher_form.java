import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class deleteTeacher_form {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public deleteTeacher_form() {
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

		JLabel lblNewLabel = new JLabel("Enter Teacher ID");
		lblNewLabel.setForeground(new Color(248, 249, 250));
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(86, 124, 141, 33);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(108, 117, 125));
		textField.setBounds(205, 127, 308, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBounds(249, 158, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(486, 11, 88, 23);
		frame.getContentPane().add(btnReturn);
	}

	/**
	 * Initialize the contents of the frame.
	 */
}
