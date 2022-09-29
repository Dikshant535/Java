package com.qsn3;

public class Loan {
	
	private Loan() {
	
		super();

	}
	
	public static Loan getLoan() {
		
		Loan l = new Loan();
		
		return l;
	}

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof TemporaryEmployee) {
			
			employeeObj.calculateSalary();
			double el = employeeObj.getSalary();
			
			double sal = (el*10)/100;
			return sal;
			
		}else if(employeeObj instanceof PermanentEmployee) {
			employeeObj.calculateSalary();
			double sal = (employeeObj.getSalary()*15)/100;
			return sal;			
			
		}	else {
			return 0;
		}
		
	}
	
	
}
