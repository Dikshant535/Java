package com.qsn3;

public class Account {
	
	String accountNumber ;
	double balance ;
	
	public void deposit(int amount) {
		
		balance = balance+amount;
	}
	
	public double withdraw(int amount) throws InsufficientFundsException{
		
		if(this.balance>amount) {
			balance = balance-amount ;
			return amount;
		}else {
			
			InsufficientFundsException ise = new InsufficientFundsException("Insuficient Balance..!");
			throw ise;
		}
		

	}

	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	
	
}
