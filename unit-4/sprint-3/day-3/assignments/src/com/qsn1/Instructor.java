package com.qsn1;

public class Instructor extends Person {
	
	

//	public Instructor(Address a, String name, String gender, int instructorId, int salary) {
//		super(a, name, gender);
//		this.instructorId = instructorId;
//		this.salary = salary;
//	}

	private int instructorId ;
	private int salary ;
	
	
	@Override
	public String toString() {
		return("Instructor"+"["+"instructorId="+this.getInstructorId()+","+" "+"salary="+this.getSalary()+","+"address="+"Address"+"["+"city="+this.getAddress().getCity()+","+"state="+this.getAddress().getState()+","+"pinCode="+this.getAddress().getPinCode()+"]"+"]");
	}
	
	
	
	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}
