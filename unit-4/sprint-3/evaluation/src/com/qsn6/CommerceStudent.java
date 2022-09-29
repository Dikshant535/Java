package com.qsn6;

public class CommerceStudent implements Student{
	
	private int accountMarks; 
	private int economicsMarks; 
	private int businessStudiesMarks;
	
	
	public int getAccountMarks() {
		return accountMarks;
	}
	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}
	
	
	public int getEconomicsMarks() {
		return economicsMarks;
	}
	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}
	
	
	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}
	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}
	
	
	public CommerceStudent(int accountMarks, int economicsMarks, int businessStudiesMarks) {
		super();
		this.accountMarks = accountMarks;
		this.economicsMarks = economicsMarks;
		this.businessStudiesMarks = businessStudiesMarks;
	}
	@Override
	public double findPercentage() {
		
		double tot = this.getAccountMarks()+this.getEconomicsMarks()+this.getBusinessStudiesMarks();
		double per =  (tot/300)*100;
		
		return per;
	}
	
	
	
}
