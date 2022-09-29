package com.qsn3;

public class CardPayment implements Payment{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done using Card "+amount);
	}
	
	private int amount ;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public CardPayment(int amount) {
		super();
		this.amount = amount;
	}
	

}
