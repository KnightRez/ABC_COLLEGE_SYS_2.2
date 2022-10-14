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
	public static void teacher_form(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_form window = new Teacher_form();
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
	public Teacher_form() {
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
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main_frame = new Main();
				main_frame.main(null);
				frame.dispose();
			}
		});
		
		btnAddNewTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNewTeacher_form addnewTeacher_frame = new addNewTeacher_form();
				addnewTeacher_frame.addnewteacher_form(null);
				frame.dispose();
			}
		});
		
		btnUpdateTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTeacher_form updateTeacher_frame = new updateTeacher_form();
				updateTeacher_frame.updateteacher_form(null);
				frame.dispose();
			}
		});
		
		btnDeleteTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main_frame = new Main();
				main_frame.main(null);
				frame.dispose();
			}
		});
		
		btnComputeSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main_frame = new Main();
				main_frame.main(null);
				frame.dispose();
			}
		});
		
		btnDisplayAllTeachers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main_frame = new Main();
				main_frame.main(null);
				frame.dispose();
			}
		});	
				
	}

}
