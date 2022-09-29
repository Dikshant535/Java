package com.qsn5;

import java.util.Scanner;

public class UserRegistration {
	
	void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		if("India".equals(userCountry)) {
			
			System.out.println("User registration done successfully");
			
		}else {
			
			InvalidCountryException e = new InvalidCountryException("User Outside India cannot be registered");
			throw e;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserRegistration u1 = new UserRegistration();
		System.out.println("Enter name ");
		String name = sc.next();
		System.out.println("Enter Country ");
		String con = sc.next();
		
		
		try {
			
			u1.registerUser(name, con);
			
		} catch (InvalidCountryException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Thank you!");
	}
	
	
}
