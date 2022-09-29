package com.qsn3;

public class Bank {
	
	 private Bank(){
	      System.out.println("Inside private constructor of Bank");
	   }

	public static Bank getBAnk() {
		Bank b = new Bank();
		
		return b;
	}
}
