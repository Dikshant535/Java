package com.masai;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.setRoll(10);
		s1.setName("Ram");
		s1.setAge(20);
		s1.setMarks(600);
		
		Student s2 = new Student(11,"Ramesh",15,99);
		
		System.out.println("Details OF Student 1 :");
		System.out.println("Roll is : "+s1.getRoll());
		System.out.println("Name is : "+s1.getName());
		System.out.println("Age is : "+s1.getAge());
		System.out.println("Marks is : "+s1.getMarks());
		
		
		System.out.println("Details OF Student 2 :");
		System.out.println("Roll is : "+s2.getRoll());
		System.out.println("Name is : "+s2.getName());
		System.out.println("Age is : "+s2.getAge());
		System.out.println("Marks is : "+s2.getMarks());
	}

}
