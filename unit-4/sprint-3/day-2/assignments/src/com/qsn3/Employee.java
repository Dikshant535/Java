package com.qsn3;

public class Employee extends Member{

	private String Specialisation;
	private String Department;
	
	
	
	public String getSpecialisation() {
		return Specialisation;
	}



	public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
	}



	public String getDepartment() {
		return Department;
	}



	public void setDepartment(String department) {
		Department = department;
	}



	public Employee(String Name, int Age, String phoneNumber, String Address, double Salary, String specialisation,
			String department) {
		super(Name, Age, phoneNumber, Address, Salary);
		this.Specialisation = specialisation;
		this.Department = department;
	}
	
	
	
}
