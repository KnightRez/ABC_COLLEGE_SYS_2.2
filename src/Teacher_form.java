import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Teacher_form {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Teacher_form(Accounting db) {
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

		JButton btnAddNewTeacher = new JButton("Add New Teacer");
		btnAddNewTeacher.setForeground(new Color(33, 37, 41));
		btnAddNewTeacher.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnAddNewTeacher.setBackground(new Color(248, 249, 250));
		btnAddNewTeacher.setBounds(190, 29, 206, 23);
		frame.getContentPane().add(btnAddNewTeacher);

		JButton btnUpdateTeacher = new JButton("Update Teacher");
		btnUpdateTeacher.setForeground(new Color(33, 37, 41));
		btnUpdateTeacher.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnUpdateTeacher.setBackground(new Color(248, 249, 250));
		btnUpdateTeacher.setBounds(190, 81, 206, 23);
		frame.getContentPane().add(btnUpdateTeacher);

		JButton btnDeleteTeacher = new JButton("Delete Teacher");
		btnDeleteTeacher.setForeground(new Color(33, 37, 41));
		btnDeleteTeacher.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnDeleteTeacher.setBackground(new Color(248, 249, 250));
		btnDeleteTeacher.setBounds(190, 133, 206, 23);
		frame.getContentPane().add(btnDeleteTeacher);

		JButton btnComputeSalary = new JButton("Calculate Salary");
		btnComputeSalary.setForeground(new Color(33, 37, 41));
		btnComputeSalary.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnComputeSalary.setBackground(new Color(248, 249, 250));
		btnComputeSalary.setBounds(190, 185, 206, 23);
		frame.getContentPane().add(btnComputeSalary);

		JButton btnDisplayAllTeachers = new JButton("Show All Teachers");
		btnDisplayAllTeachers.setForeground(new Color(33, 37, 41));
		btnDisplayAllTeachers.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnDisplayAllTeachers.setBackground(new Color(248, 249, 250));
		btnDisplayAllTeachers.setBounds(190, 237, 206, 23);
		frame.getContentPane().add(btnDisplayAllTeachers);

		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(486, 257, 88, 23);
		frame.getContentPane().add(btnReturn);

		/**
		 * Action Event Listeners
		 */
		btnReturn.addActionListener(e -> {
//				Main main_frame = new Main(db);
//				main_frame.main(null);
			MainMenu mm = new MainMenu(db);
			frame.dispose();
		});

		btnAddNewTeacher.addActionListener(e -> {
//			addNewTeacher_form addnewTeacher_frame = new addNewTeacher_form();
//			addnewTeacher_frame.addnewteacher_form(null);
			addNewTeacher_form addnewTeacher_frame = new addNewTeacher_form(db);
			frame.dispose();
		});

		btnUpdateTeacher.addActionListener(e -> {
			updateTeacher_form updateTeacher_frame = new updateTeacher_form(db);
			frame.dispose();
		});

		btnDeleteTeacher.addActionListener(e -> {
//				Main main_frame = new Main(db);
//				main_frame.main(null);
			MainMenu mm = new MainMenu(db);
			frame.dispose();
		});

		btnComputeSalary.addActionListener(e -> {
//				Main main_frame = new Main(db);
//				main_frame.main(null);
			MainMenu mm = new MainMenu(db);
			frame.dispose();
		});

		btnDisplayAllTeachers.addActionListener(e -> {
//				Main main_frame = new Main(db);
//				main_frame.main(null);
		MainMenu mm = new MainMenu(db);
		frame.dispose();
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
}
