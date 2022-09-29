package com.qsn1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


//Q)Write a JDBC application to take a Course name from the user and print all the Student details who enrolled in that course.


public class Jdbc4 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course name ");
		String cname = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/c4";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "root")){
			
				PreparedStatement ps = conn.prepareStatement("select s.roll,s.name,s.address,s.mobile  from student s inner join course c inner join student_course cs on cs.roll = s.roll and cs.cid = c.cid where c.cname=?");
			
				ps.setString(1, cname);
				
				ResultSet rs = ps.executeQuery();
				boolean flag = true ;
				while(rs.next()) {
					
					flag = false ;
					
					int roll = rs.getInt("roll");
					String name  = rs.getString("name");
					String add = rs.getString("address");
					String mo = rs.getString("mobile");
					
					System.out.println("Roll is "+roll);
					System.out.println("Name is "+name);
					System.out.println("Address id "+add);
					System.out.println("Mobile no. "+mo);
					
					System.out.println("======================================");
					
					
				}
				
				if(flag)
					System.out.println("no record found......");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
