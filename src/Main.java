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
	public Accounting db = new Accounting();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Accounting db = new Accounting();
		MainMenu mm = new MainMenu(db);
	}
	/**
	 * Create the application.
	 */
}
