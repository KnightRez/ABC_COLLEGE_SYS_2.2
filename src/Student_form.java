import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_form {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Student_form(Accounting db) {
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

		JButton btnAddNewStudent = new JButton("Add New Student");
		btnAddNewStudent.setForeground(new Color(33, 37, 41));
		btnAddNewStudent.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnAddNewStudent.setBackground(new Color(248, 249, 250));
		btnAddNewStudent.setBounds(190, 16, 206, 23);
		frame.getContentPane().add(btnAddNewStudent);

		JButton btnUpdateStudent = new JButton("Update Student");
		btnUpdateStudent.setForeground(new Color(33, 37, 41));
		btnUpdateStudent.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnUpdateStudent.setBackground(new Color(248, 249, 250));
		btnUpdateStudent.setBounds(190, 55, 206, 23);
		frame.getContentPane().add(btnUpdateStudent);

		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.setForeground(new Color(33, 37, 41));
		btnDeleteStudent.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnDeleteStudent.setBackground(new Color(248, 249, 250));
		btnDeleteStudent.setBounds(190, 94, 206, 23);
		frame.getContentPane().add(btnDeleteStudent);

		JButton btnShowRemainingBalance = new JButton("Show remaining balance");
		btnShowRemainingBalance.setForeground(new Color(33, 37, 41));
		btnShowRemainingBalance.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnShowRemainingBalance.setBackground(new Color(248, 249, 250));
		btnShowRemainingBalance.setBounds(190, 133, 206, 23);
		frame.getContentPane().add(btnShowRemainingBalance);

		JButton btnFeeDeposit = new JButton("Fee deposit");
		btnFeeDeposit.setForeground(new Color(33, 37, 41));
		btnFeeDeposit.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnFeeDeposit.setBackground(new Color(248, 249, 250));
		btnFeeDeposit.setBounds(190, 172, 206, 23);
		frame.getContentPane().add(btnFeeDeposit);

		JButton btnDisplayAllStudents = new JButton("Students with zero balance");
		btnDisplayAllStudents.setForeground(new Color(33, 37, 41));
		btnDisplayAllStudents.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnDisplayAllStudents.setBackground(new Color(248, 249, 250));
		btnDisplayAllStudents.setBounds(190, 211, 206, 23);
		frame.getContentPane().add(btnDisplayAllStudents);

		JButton btnStudentsWithNonzero = new JButton("Students with non-zero balance");
		btnStudentsWithNonzero.setForeground(new Color(33, 37, 41));
		btnStudentsWithNonzero.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnStudentsWithNonzero.setBackground(new Color(248, 249, 250));
		btnStudentsWithNonzero.setBounds(190, 250, 206, 23);
		frame.getContentPane().add(btnStudentsWithNonzero);

		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(new Color(33, 37, 41));
		btnReturn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnReturn.setBackground(new Color(248, 249, 250));
		btnReturn.setBounds(486, 257, 88, 23);
		frame.getContentPane().add(btnReturn);


		/**
		 * Action Event Listeners
		 */
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main_frame = new Main();
				main_frame.main(null);
				frame.dispose();
			}
		});

		btnAddNewStudent.addActionListener(e -> {
//			addNewStudent_form addnewstudent = new addNewStudent_form();
//			addnewstudent.addnewstudent_form(null);
			addNewStudent_form addNewStudentForm = new addNewStudent_form(db);
			frame.dispose();
		});

		btnUpdateStudent.addActionListener(e -> {
			updateStudent_form updatestudent = new updateStudent_form(db);
			frame.dispose();
		});

		btnDeleteStudent.addActionListener(e -> {
			deleteStudent_form deletestudentform = new deleteStudent_form(db);
			frame.dispose();
		});

		btnShowRemainingBalance.addActionListener(e -> {
			remainingBalanceStudent_form remainingBalance = new remainingBalanceStudent_form(db);
			frame.dispose();
		});

		btnFeeDeposit.addActionListener(e -> {
			feeDepositStudent_form feedeposit = new feeDepositStudent_form(db);
			frame.dispose();
		});

		btnDisplayAllStudents.addActionListener(e -> {
			zeroBalanceStudent_form zerobalance = new zeroBalanceStudent_form(db);
			frame.dispose();
		});

		btnStudentsWithNonzero.addActionListener(e -> {
			withBalanceStudent_form withbalance = new withBalanceStudent_form(db);
			frame.dispose();
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */

}
