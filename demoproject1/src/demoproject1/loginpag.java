package demoproject1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.sql.*;

public class loginpag {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpag window = new loginpag();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginpag() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1285, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Hospital Management System");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(409, 30, 459, 86);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(346, 145, 116, 35);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(564, 145, 168, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(346, 210, 116, 35);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(564, 213, 168, 35);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
					java.sql.Statement st;
					st=con.createStatement();
					String UserName=textField.getText();
					String Password=textField_1.getText();
					ResultSet rs=((java.sql.Statement) st).executeQuery("select * from login where UserName='"+UserName+"' && Password='"+Password+"'");
					if(rs.next())
					{
						if(UserName.equals(UserName) && Password.equals(Password))
						{
							
							frame.dispose();//for login to home page 
							HomePage h1= new HomePage();
							h1.setVisible(true);
							JOptionPane.showMessageDialog(btnNewButton,"Login Successfully");

						}
						else
						{
							//System.out.println("invalid username and password");
							
							JOptionPane.showMessageDialog(btnNewButton,"Invalid Username or Password");
						}
					}}
					catch(Exception e1)
					{
						System.out.println(e1);
					}
			}
		});			
				
			
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(477, 346, 116, 45);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\page.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1561, 1034);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
