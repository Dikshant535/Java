package com.qsn4;

public class Main {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadA tha = new ThreadA();
		ThreadB thb = new ThreadB(tha);
		ThreadC thc = new ThreadC(thb);
		
		tha.setName("Dhoni");
		thb.setName("Rohit");
		thc.setName("Kholi");
		
		tha.setPriority(10);
		
		tha.start();
		thb.start();
		thc.start();
		
	}
	
	
}
