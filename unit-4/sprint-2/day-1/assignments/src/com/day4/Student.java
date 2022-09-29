package com.day4;

public class Student {
	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("Roll is : "+roll+"\n"+"Name is : "+name+"\n"+"Marks is : "+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.roll=1;
		s1.name="Rohit";
		s1.marks=85;
		s1.displayStudentDetails();
		Student s2 = new Student();
		s2.roll=2;
		s2.name="Sanket";
		s2.marks=95;
		s2.displayStudentDetails();
		s1 = null;
		s2 = null;
		s1.displayStudentDetails();
		s2.displayStudentDetails();
	}

}
