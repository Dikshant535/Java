package com.qsn1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Q)Write a JDBC application to insert 5 Student details by taking input from the user(Venkat, Amit, Raj, Binay, Suresh).


public class Jdbc1 {
	
	
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter roll");
			int roll = sc.nextInt();
			
			System.out.println("Enter name ");
			String name = sc.next();
			
			System.out.println("Enter address");
			String add = sc.next();
			
			System.out.println("Enter mobile");
			String mob = sc.next();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/C4";
			
			try (Connection conn = DriverManager.getConnection(url, "root", "root")){
				
				PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
				
				ps.setInt(1,roll);
				ps.setString(2,name);
				ps.setString(3,add);
				ps.setString(4,mob);
				
			   int x =ps.executeUpdate();
			   
			   if(x>0) {
				   
				   System.out.println("record added Sucessfully....");
				   
			   }else
				   System.out.println("not added.....");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
