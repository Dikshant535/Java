package com.qsn3;

public class PermanentEmployee extends Employee{


	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	@Override
	public void calculateSalary() {
		
		double amt = this.getBasicPay()*0.12;
		double salary = this.getBasicPay()-amt;
		this.setSalary(salary);
	}
	
	private double basicPay;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	

}
