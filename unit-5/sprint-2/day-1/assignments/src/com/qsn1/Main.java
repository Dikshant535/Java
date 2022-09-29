package com.qsn1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter a number :");
			String s = sc.next();
			int num = Integer.parseInt(s);
			System.out.println("The square value is "+(num*num));
			
		}catch (Exception e) {
			
			System.out.println("Entered input is not a valid format for an integer.");
			
		}	
		
		System.out.println("The work has been done sucessfully");
		
		
		
	}
	
	
}
