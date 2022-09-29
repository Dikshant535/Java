package com.masai;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Enter Number of Students you want to enter");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("============================");
		int i=1;
		while(i<=num) {
			System.out.println("Enter Student name : ");
			String studentName = sc.next();
			
			System.out.println("Enter Student roll number : ");
			int rollNumber = sc.nextInt();
			
			System.out.println("Enter Student marks : ");
			int marks = sc.nextInt();
			
			Student s1 = new Student(rollNumber,studentName,marks);
			System.out.println("Student Details 0"+i);
			System.out.println("=========================");
			
			System.out.println("Student Roll Number:"+s1.getRollNumber());;
			System.out.println("Student Name:"+s1.getStudentName());
			System.out.println("Student Mark:"+s1.getMarks());
			
			System.out.println("===============================");
			
			i++;
		}
	}
}
