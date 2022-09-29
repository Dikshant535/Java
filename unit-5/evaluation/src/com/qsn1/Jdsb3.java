package com.qsn1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//Q) Write a JDBC application to take the Student roll number from the user and print all course details in which he has enrolled. 
//(If the user will pass any invalid student roll number then print(No record found)).


public class Jdsb3 {
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll");
		int roll = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/c4";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "root")){
			
				PreparedStatement ps = conn.prepareStatement(" select c.cid,c.cname,c.fee,c.duration from course c inner join student s inner join student_course cs on cs.roll = s.roll and cs.cid = c.cid where s.roll = ?");
			
				ps.setInt(1,roll);
				
			ResultSet rs =ps.executeQuery();
			boolean flag = true;
			while(rs.next()) {
				flag =false;
				int cid = rs.getInt("cid");
				String cname = rs.getString("cname");
				int fee = rs.getInt("fee");
				String dur = rs.getString("duration");
				
				System.out.println("Cid is "+cid);
				System.out.println("Cname is "+cname);
				System.out.println("Fee is "+fee);
				System.out.println("Duration is "+dur);
				System.out.println("================================");
				
				
			}
			
			if(flag)
				System.out.println("No record found");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
