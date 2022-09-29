package com.masai;

import java.util.Scanner;

public class Main {
	
	public static String reverseString(String str) {
		if(str!=null) {
			char[] ch = new char[str.length()];
			String ans ="";
			for(int i=0;i<str.length();i++) {
				ch[i] = str.charAt(i);
			}
			
			for(int i=ch.length-1;i>=0;i--) {
				ans+=ch[i];
			}
			
			return ans;
		}else {
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to be reversed : ");
		String originalString = sc.next();
		String reverse = reverseString(originalString);
		
		System.out.println("Original String is : "+originalString);
		System.out.println("Reversed String is : "+reverse);
		
	}

}
