package com.qsn3;

import java.util.Scanner;

public class Main implements X{

//	@Override
	public int convetStringToNumber(String s) {
			try {
				
				int n = Integer.parseInt(s);
				return n;
				
			}catch ( NumberFormatException nfe) {
				// TODO: handle exception
				
				throw nfe;
			}
			
			
			
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number in string format");
		String s = sc.next();
		
		Main m = new Main();
		try {
			
			int n = m.convetStringToNumber(s);
			System.out.println(n);
			
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Enter the number");
			
		}
		
		
	}
	
}
