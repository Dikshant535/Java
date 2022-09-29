package com.qsn2;

import java.util.Scanner;
import java.util.TreeSet;

import com.qsn1.Product;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        TreeSet<Employee> Employees = new TreeSet<>() ;
		
		for(int i=0;i<4;i++){
			
			System.out.println("Enter Details of Employee "+(i+1));
			
			System.out.println("Enter employee ID :");
			int employeeId = sc.nextInt() ;
			System.out.println("Enter employee name: ");
			String employeeName = sc.next() ;
			System.out.println("Enter employee salary: ");
			double employeePrice = sc.nextDouble() ;
			
			
			Employee p = new Employee(employeeId, employeeName, employeePrice);
			Employees.add(p);
			
		}
		
		System.out.println(Employees);
		
	}

}
