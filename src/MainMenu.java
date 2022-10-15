import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainMenu extends JFrame {
    public MainMenu(Accounting db) {
        EventQueue.invokeLater(() -> {
            try {
                setVisible(true);
                setLocationRelativeTo(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
         new JFrame();
        setUndecorated(true);
        getContentPane().setBackground(new Color(33, 37, 41));
        setBackground(new Color(33, 37, 41));
        setResizable(false);
        setBounds(100, 100, 584, 291);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel TItleLabel = new JLabel("ABC COLLEGE FINANCIAL MANAGEMENT SYSTEM", SwingConstants.CENTER);
        TItleLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
        TItleLabel.setForeground(new Color(248, 249, 250));
        TItleLabel.setBounds(10, 21, 564, 49);
        getContentPane().add(TItleLabel);

        JButton teacherButton = new JButton("TEACHERS");
        teacherButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
        teacherButton.setForeground(new Color(33, 37, 41));
        teacherButton.setBackground(new Color(248, 249, 250));
        teacherButton.setBounds(208, 119, 170, 23);
        getContentPane().add(teacherButton);

        JButton studentButton = new JButton("STUDENTS");
        studentButton.setForeground(new Color(33, 37, 41));
        studentButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
        studentButton.setBackground(new Color(248, 249, 250));
        studentButton.setBounds(208, 166, 170, 23);
        getContentPane().add(studentButton);

        JButton btnQuit = new JButton("QUIT");
        btnQuit.setForeground(new Color(33, 37, 41));
        btnQuit.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
        btnQuit.setBackground(new Color(248, 249, 250));
        btnQuit.setBounds(208, 215, 170, 23);
        getContentPane().add(btnQuit);


        /**
         * ACTION EVENT LISTENERS
         */
        btnQuit.addActionListener(e -> System.exit(0));

        studentButton.addActionListener(e -> {
            Student_form stud_frame = new Student_form(db);
            dispose();
        });

        teacherButton.addActionListener(e -> {
            Teacher_form teacher_frame = new Teacher_form(db);
            dispose();
        });
    }
}

