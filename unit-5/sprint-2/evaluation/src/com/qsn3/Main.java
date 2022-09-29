package com.qsn3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		List<Employee> employee = new ArrayList<>();
		
		students.add(new Student(1, "n1", 350, "delhi")) ;
		students.add(new Student(2, "n2", 450, "chd")) ;
		students.add(new Student(3, "n3", 550, "punjab")) ;
		students.add(new Student(4, "n4", 650, "dehradun")) ;
		students.add(new Student(5, "n5", 750, "mumbai")) ;
		
		Stream<Student> stream = students.stream();
		Stream<Employee> myS = stream.map(ss -> {
			Employee employees = null ;
			
			if(ss.getMarks()>500) {
				
				employees = new Employee(ss.getRoll(), ss.getName(), ss.getMarks()*10000, ss.getAddress());
				
				return employees;
				
			}
			
			return employees;
		});
		
		myS.forEach(e -> {
			if(e!=null) 
				employee.add(e);
			
		});
		
		
		employee.forEach(s -> System.out.println(s));
		
		
		
		
		
	}
	
	
	
	
}
