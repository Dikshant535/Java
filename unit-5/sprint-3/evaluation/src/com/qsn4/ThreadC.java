package com.qsn4;

public class ThreadC extends Thread{
	
	ThreadB thb;
	
	
	public ThreadC(ThreadB thb) {
		super();
		this.thb = thb;
	}


	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		
		try {
			thb.join();
			for(int i=1;i<=10;i++) {
				
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
	}
	
	
	
}
