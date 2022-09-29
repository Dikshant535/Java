package com.qsn4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("...Welcome to Employee Management System....");
		System.out.println();
		int n = 1;
		int flag =0 ;
		while(true) {
			
			
			System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
			String choice = sc.next();
			if("y".equals(choice)||"Y".equals(choice)) {
				
				System.out.println("Enter the Employee Details: "+n);
				System.out.println("--------------------------------");
				System.out.println("Enter the Employee Id:");
				int employeeId = sc.nextInt() ;
				System.out.println("Enter the Employee Name:");
				String employeeName = sc.next() ;
				System.out.println("Enter the Employee Salary:");
				double employeeSalary = sc.nextDouble();
				System.out.println("Enter the Department Id:");
				int departmentId = sc.nextInt();
				System.out.println("Enter the Department Name:");
				String departmentName = sc.next();
				
				
				Department department = new Department(departmentId, departmentName); 
				Employee employee = new Employee(employeeId, employeeName, employeeSalary, department);
				employees.add(employee);
				System.out.println("Employee Details added successfully....");
				n++;
				
			}else if("n".equals(choice)||"N".equals(choice)) {
				System.out.println("Thankyou....");
				while(true) {
					
					System.out.println("Enter the your Choice"+"\n"+"1: Find Employee in Particular Department"+"\n"+"2: Remove Particular Employee"+"\n"+"3: Print Employees in All Departments");
					int ch = sc.nextInt() ;
					if(ch==3) {
						
						for(Employee e:employees) {
							
							System.out.println("Employee [id="+e.getEmployeeId()+", name="+e.getEmployeeName()+", salary="+e.getEmployeeSalary()+", department=Department [departmentId="+e.getDepartment().getDepartmentId()+", departmentName="+e.getDepartment().getDepartmentName()+"]]");
							System.out.println("----------------------------------------");
						}
						System.out.println("Do you want to Exit: ? (Y/N)");
						String chn = sc.next();
						if("y".equals(chn)||"Y".equals(chn)) {
							System.out.println("Thankyou...");
							flag =1 ;
							break ;
						}
					}else if(ch==1) {
						
						System.out.println("Enter the Department Id:");
						int di = sc.nextInt();
						System.out.println("Employee in Department:"+di);
						for(Employee ee:employees) {
							int chk = ee.getDepartment().getDepartmentId();
							if(chk==di) {
								
								
								System.out.println("Employee Name:"+ee.getEmployeeName());
								System.out.println("Employee Id:"+ee.getEmployeeId());
								System.out.println("Employee Salary:"+ee.getEmployeeSalary());
								System.out.println("=========================================");
								
								
							}
							
						}
						System.out.println("Do you want to Exit: ? (Y/N)");
						String chn = sc.next();
						if("y".equals(chn)||"Y".equals(chn)) {
							System.out.println("Thankyou...");
							flag =1 ;
							break ;
						}
						
						
					}else if(ch==2) {
						System.out.println("Enter Enter Department Id:");
						int del = sc.nextInt();
						for(Employee de:employees) {
							
							if(de.getDepartment().getDepartmentId()==del) {
								
								
								System.out.println(de.getEmployeeName()+" Employee is removed from the department "+de.getDepartment().getDepartmentId()+" successfully");
								employees.remove(de);
								break;
							}
						}
//						for(int i=0;i<employees.size();i++) {
//							
//							Employee epp = employees.get(i);
//							if(epp.getDepartment().getDepartmentId()==del) {
//								System.out.println(epp.getEmployeeName()+" Employee is removed from the department id "+epp.getDepartment().getDepartmentId()+" successfully");
//								employees.remove(i);
//								break;
//							}
//							
//						}
						
						System.out.println("Do you want to Exit: ? (Y/N)");
						String chn = sc.next();
						if("y".equals(chn)||"Y".equals(chn)) {
							System.out.println("Thankyou...");
							flag =1 ;
							break ;
						}
						
						
					}
					if(flag==1) {
						break ;
					}
					
				}
				if(flag==1) {
					break ;
				}
				
				
				
			}
		}
		
		
		
		
	}

}
