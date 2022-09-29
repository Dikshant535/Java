package com.qsn3;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account ac1 = new Account("109109", 500);
		
		ac1.deposit(1000);
		
		try {
			double am = ac1.withdraw(1600);
			System.out.println("Rs "+am);
		} catch (InsufficientFundsException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("End of main() method");
	}
	
	
	
}
