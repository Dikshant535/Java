package com.qsn3;

public class Main {

	public static void main(String[] args) {
		
		Member m1 = new Employee("Dikshant", 18, "12345678901", "Mumbai", 123.00, "Java", "RLD");
//		Employee employee = new Employee("Sanket", 23, "12345678901", "Mumbai", 123123.00, "Java Developer",
//				"Java Department");
		
		m1.printSalary();
		
		System.out.println("Name is : "+m1.getName());
		
		System.out.println("Age is : "+m1.getAge());
		
		System.out.println("Phone Number is : "+m1.getPhoneNumber());
		
		System.out.println("Address is : "+m1.getAddress());
//		m1.getSalary();
//		System.out.println("");
		Employee e = (Employee)m1;
		System.out.println("Specialisation is : "+e.getSpecialisation());
		
		
		System.out.println("Department is : "+e.getDepartment());
		
		System.out.println("====================================================================");
		Member m2 = new Manager("Sanket", 18, "12345678901", "Mumbai", 300.00, "Java", "Development");
		m2.printSalary();
		
		m2.printSalary();
		
		System.out.println("Name is : "+m2.getName());
		
		System.out.println("Age is : "+m2.getAge());
		
		System.out.println("Phone Number is : "+m2.getPhoneNumber());
		
		System.out.println("Address is : "+m2.getAddress());
//		m1.getSalary();
//		System.out.println("");
		Manager mm = (Manager)m2;
		System.out.println("Specialisation is : "+mm.getSpecialisation());
		
		
		System.out.println("Department is : "+mm.getDepartment());

	}

}
