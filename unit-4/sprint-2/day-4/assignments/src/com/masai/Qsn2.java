package com.masai;

import java.util.Scanner;

public class Qsn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String sr = sc.nextLine();
		
		System.out.println("Enter the character position you want to access:");
		int  p = sc.nextInt();
		
		
		char elem = sr.charAt(p);
		System.out.println(elem);
		
		
		
	}

}
