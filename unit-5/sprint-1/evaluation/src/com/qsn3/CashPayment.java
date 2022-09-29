package com.qsn3;

public class CashPayment implements Payment{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Cash "+amount);
	}
	
	private int amount ;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public CashPayment(int amount) {
		super();
		this.amount = amount;
	}
	

}
