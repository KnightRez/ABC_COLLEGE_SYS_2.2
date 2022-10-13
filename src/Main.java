import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(33, 37, 41));
		frame.setBackground(new Color(33, 37, 41));
		frame.setResizable(false);
		frame.setBounds(100, 100, 584, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel TItleLabel = new JLabel("ABC COLLEGE FINANCIAL MANAGEMENT SYSTEM", SwingConstants.CENTER);
		TItleLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		TItleLabel.setForeground(new Color(248, 249, 250));
		TItleLabel.setBounds(10, 21, 564, 49);
		frame.getContentPane().add(TItleLabel);

		JButton teacherButton = new JButton("TEACHERS");
		teacherButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		teacherButton.setForeground(new Color(33, 37, 41));
		teacherButton.setBackground(new Color(248, 249, 250));
		teacherButton.setBounds(208, 119, 170, 23);
		frame.getContentPane().add(teacherButton);

		JButton studentButton = new JButton("STUDENTS");
		studentButton.setForeground(new Color(33, 37, 41));
		studentButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		studentButton.setBackground(new Color(248, 249, 250));
		studentButton.setBounds(208, 166, 170, 23);
		frame.getContentPane().add(studentButton);

		JButton btnQuit = new JButton("QUIT");
		btnQuit.setForeground(new Color(33, 37, 41));
		btnQuit.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnQuit.setBackground(new Color(248, 249, 250));
		btnQuit.setBounds(208, 215, 170, 23);
		frame.getContentPane().add(btnQuit);


		/**
		 * ACTION EVENT LISTENERS
		 */
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		studentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student_form stud_frame = new Student_form();
				stud_frame.student_form(null);
				frame.dispose();
			}
		});
	}
}
