package com.qsn4;

public class ThreadB extends Thread{
	int prob = 1;
	
	ThreadA  tha;
	
	
	public ThreadB( ThreadA tha) {
		super();
		
		this.tha = tha;
	}


	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		
		
		
		try {
			
			tha.join();
			for(int i=1;i<=10;i++) {
		
				prob = prob*i;
		
			}
			System.out.println("Product is : "+prob);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}
	
	
}
