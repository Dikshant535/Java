package com.qsn2;

public class Main {
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		
		Thread t1 = new Thread(ta);
		
		t1.start();
		
		synchronized (t1) {
			
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		System.out.println("Product is : "+ta.pro);
		
	}
	
	
}
