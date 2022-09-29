package com.qsn4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer a  :");
		int a = sc.nextInt();
		
		System.out.println("Enter integer b :");
		int b = sc.nextInt();
		
		try {
			int c = a/b ;
			
			System.out.println("The quotient of "+a+"/"+b+" = "+c);
			
		}catch (ArithmeticException e) {
			
			System.out.println("DivideByZeroException caught");
		}finally {
			System.out.println("Inside finally block");
		}	
		
		
		
		
	}
	
	
}
