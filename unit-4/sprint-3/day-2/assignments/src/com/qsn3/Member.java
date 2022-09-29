package com.qsn3;

public class Member {
	
	private String Name;
	private int Age;
	private String phoneNumber;
	private String Address;
	private double Salary;
	
	public void printSalary() {
		
		System.out.println("Salary is : "+Salary);
		
	}
	
	
	Member(String Name,int Age,String phoneNumber,String Address,double Salary){
		this.Name = Name;
		this.Age = Age;
		this.phoneNumber = phoneNumber;
		this.Address = Address;
		this.Salary = Salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	
}
