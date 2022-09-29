package com.masai;


public class Student {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student() {
		
	}
	
	public Student(int roll,String name,int age,int marks){
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>18&age<60) {
			this.age = age;
		}else {
			System.out.println("Invalid Age..!");
		}
		
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		if(marks>0&marks<500) {
			this.marks = marks;
		}else {
			System.out.println("Invalid Marks");
		}
		
	}
	

}
