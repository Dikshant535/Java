package com.sqn3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = Student.getStudent(false);
		System.out.println("For False");
		System.out.println("===================");
		System.out.println("roll is : "+s1.getRoll());
		System.out.println("Name is : "+s1.getName());
		System.out.println("Address is : "+s1.getAddress());
		System.out.println("Collage Name is : "+s1.getCollageName()+"\n");
		
		System.out.println("-------------------------------"+"\n");
		
		Student s2 = Student.getStudent(true);
		System.out.println("For True");
		System.out.println("===================");
		System.out.println("roll is : "+s2.getRoll());
		System.out.println("Name is : "+s2.getName());
		System.out.println("Address is : "+s2.getAddress());
		System.out.println("Collage Name is : "+s2.getCollageName());
	}

}
