/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangla.oyo.View;

import bangla.oyo.Controller.CustomerController;
import bangla.oyo.Controller.RoomController;

import java.awt.*;
import java.awt.EventQueue;


import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class CheckOut extends JFrame{

	private JPanel contentPane;
	private JTextField t1;
	Choice c1;
	CustomerController cus= new CustomerController();
	RoomController rm= new RoomController();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckOut frame = new CheckOut();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close(){
		this.dispose();
	}

	public CheckOut() {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 200, 800, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

				ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/sixth.jpg"));
				Image i3 = i1.getImage().getScaledInstance(400, 225,Image.SCALE_DEFAULT);
				ImageIcon i2 = new ImageIcon(i3);
				JLabel l1 = new JLabel(i2);
				l1.setBounds(300,0,500,225);
				add(l1);

		JLabel lblCheckOut = new JLabel("Check Out ");
		lblCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCheckOut.setBounds(70, 11, 140, 35);
		contentPane.add(lblCheckOut);

		JLabel lblName = new JLabel("Number :");
		lblName.setBounds(20, 85, 80, 14);
		contentPane.add(lblName);

				c1 = new Choice();
				try{
					ResultSet rs =cus.get();
					while(rs.next()){
						c1.add(rs.getString("number"));
					}
				}catch(Exception e){

				}
				c1.setBounds(130, 82, 150, 20);
				contentPane.add(c1);

				ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/tick.png"));
				Image i5 = i4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
				ImageIcon i6 = new ImageIcon(i5);
				JButton l2 = new JButton(i6);
				l2.setBounds(290,82,20,20);
				add(l2);

				l2.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent ae){
						System.out.println("Hi");
						try{
							String number = c1.getSelectedItem();
							ResultSet rs = cus.getSpecific(number);

							if(rs.next()){
								System.out.println("clicked");
								t1.setText(rs.getString("room_number"));
							}
						}catch(Exception e){

						}
					}
				});


		JLabel lblRoomNumber = new JLabel("Room Number:");
		lblRoomNumber.setBounds(20, 132, 86, 20);
		contentPane.add(lblRoomNumber);

		t1 = new JTextField();
				t1.setBounds(130, 132, 150, 20);
		contentPane.add(t1);







		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								String id = c1.getSelectedItem();
								String s1 = t1.getText();

				try{
					cus.delete(id);
                                        String Status="'Available'";
					rm.setAvailable(Status,s1);


					JOptionPane.showMessageDialog(null, "Check Out Successful");
					new Reception().setVisible(true);
								setVisible(false);
				}catch(Exception e1){
					System.out.println(e1.getMessage());
				}
			}
		});
		btnCheckOut.setBounds(50, 200, 100, 25);
				btnCheckOut.setBackground(Color.BLACK);
				btnCheckOut.setForeground(Color.WHITE);
		contentPane.add(btnCheckOut);

		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
								setVisible(false);
			}
		});
		btnExit.setBounds(160, 200, 100, 25);
				btnExit.setBackground(Color.BLACK);
				btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);


				getContentPane().setBackground(Color.WHITE);
	}

}