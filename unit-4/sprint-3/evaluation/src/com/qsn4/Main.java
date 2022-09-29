package com.qsn4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String =>");
		String str = sc.next();
		
		System.out.println("Enter a position =>");
		int p = sc.nextInt();
		
		if(p>str.length()) {
			
			System.out.println("Invalid position, Please enter a valid position =>");
			p = sc.nextInt();
			
		}
		
		
		char[] ch = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
		}
		
		for(int i=0;i<ch.length;i++) {
			if(i==p) {
				
				System.out.println("Character at the position "+p+" => "+ch[i]);
				
			}	
		}
		
	}

}
