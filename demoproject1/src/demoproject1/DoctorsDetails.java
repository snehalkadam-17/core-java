package demoproject1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DoctorsDetails {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorsDetails window = new DoctorsDetails();
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
	public DoctorsDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 204, 255));
		frame.setBackground(new Color(51, 204, 255));
		frame.setBounds(100, 100, 1216, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    Doctors Details");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(382, 36, 415, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(276, 112, 95, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(476, 112, 171, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(276, 184, 95, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(276, 243, 95, 32);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Gender");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_2.setBounds(276, 305, 95, 32);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Department");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_3.setBounds(276, 477, 125, 32);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(476, 181, 171, 32);
		frame.getContentPane().add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(476, 243, 171, 32);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(476, 362, 171, 32);
		frame.getContentPane().add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ortho", "Cardiology", "Neurology", "Orthopedics"}));
		comboBox.setBounds(476, 480, 167, 32);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
							   
							   Statement st;
				if(e.getSource()==btnNewButton)
				{
	            	String ID=textField.getText();
		        	String First_Name=textField_2.getText();
					String Last_Name=textField_1.getText();
					//String Gender=textField_4.getText();
					String Mobile_No=textField_3.getText();
					String Email=textField_4.getText();
					//String Department=jcomboBox.getText();
					
				    
					PreparedStatement pstmt=con.prepareStatement("insert into doctorsdetails values(?,?,?,?,?,?,?)");

				    pstmt.setString(1,ID);                                               
				    pstmt.setString(2,First_Name);
				    pstmt.setString(3,Last_Name);
				   // pstmt.setString(4,Gender);
				    pstmt.setString(5,Mobile_No);
				    pstmt.setString(6,Email);
				    
				    
				     pstmt.executeUpdate();
				                    
					
				     JOptionPane.showMessageDialog(null, "Record inserted....", "Insert", JOptionPane.DEFAULT_OPTION);
				     textField.setText("");
				     textField_2.setText("");
				     textField_1.setText("");
				     textField_3.setText("");
				     textField_4.setText("");
				     
				     pstmt.close();
					
				}
			}
				
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(255, 582, 132, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(500, 582, 125, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HomePage h1=new HomePage();
				h1.setVisible(true);
			}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(48, 582, 113, 56);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(730, 582, 113, 56);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Next");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(971, 582, 113, 56);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\th.jpeg"));
		lblNewLabel_3.setBounds(920, 96, 234, 306);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Email");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_2_1.setBounds(276, 422, 95, 32);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(476, 426, 171, 32);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Mobile No");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBounds(276, 362, 95, 32);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(500, 305, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(633, 305, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
