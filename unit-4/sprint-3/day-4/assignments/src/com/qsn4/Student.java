package com.qsn4;

import java.util.Scanner;

public class Student {
	
	private int roll ;
	private String name ;
	private int marks ;
	private char grade;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void displayDetails() {
		
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Student :");
		String na = sc.nextLine();
		s.setName(na);
		
		System.out.println("Enter Roll Number of Student :");
		int ro = sc.nextInt();
		s.setRoll(ro);
		
		
		System.out.println("Enter Marks of Student :");
		int ma = sc.nextInt();
		s.setMarks(ma);
		
		int v = s.getMarks();
//		System.out.println(v);
		char g = calculateGrade(v);
		s.setGrade(g);
		System.out.println(s.toString());
//		s.toString();
	}
	
	public char calculateGrade(int v) {
	
		char c =' ';
		if(v>=500) {
			c= 'A';
		}else if(v<500&&v>=400){
			c= 'B';
		}else if(v<400) {
			c = 'C';
		}
		return c;
	}
	
	
	public Student() {
		
		super();
		
	}
	@Override
	public String toString() {
		
		return ("Student Details "+"[ "+"Name = "+this.getName()+","+" Roll Number = "+this.getRoll()+","+" Marks = "+this.getMarks()+","+" Grade = "+this.getGrade()+" ]");
		
	}
	
	
}
