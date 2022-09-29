package com.qsn1;

public class ThreadA extends Thread{
	int pro=1;
	
	@Override
	public void run() {
		
		synchronized (this) {
			
			for(int i=1;i<=10;i++) {
//				System.out.println("Inside a run metod of ThreadA");
				pro = pro*i;
				
			}
			
			this.notify();
		}
		
	}
	
	
}
