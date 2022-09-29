package com.qsn4;

public class ThreadA extends Thread{
	
	int sumA;
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=20;i++) {
			
			sumA+=i;
			
		}
		System.out.println("Sum is : "+sumA);
		

		
	}
	
	
}
