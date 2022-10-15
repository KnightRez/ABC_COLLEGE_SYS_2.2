import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class displayTeachers_form {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public displayTeachers_form(Accounting db) {
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 59, 711, 360);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(108, 117, 125));
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
