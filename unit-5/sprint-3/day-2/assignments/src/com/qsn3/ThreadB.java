package com.qsn3;

public class ThreadB extends Thread{
	
	ThreadA t ;
	
	
	
	public ThreadB(ThreadA t) {
		super();
		this.t = t;
	}
	
	


	@Override
	public void run() {
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int i=1;i<=20;i++) {
			
			if(i%2!=0) {
				System.out.println("Odd number "+i);
			}
			
		}
		
	}
	
	
}
