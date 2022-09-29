package com.sqn3;

public class Student {
	private int roll;
	private String name;
	private String address;
	private String collageName;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	Student(int roll,String name,String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	Student(int roll,String name,String address,String collageName){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
			Student s1 = new Student(12,"Raja","Street Colony");
			s1.setCollageName("NIT");
			return s1;
		}else {
			Student s1 = new Student(10,"ramu","America usa","Bhaddal inst.");
			return s1;
		}
	}
}
