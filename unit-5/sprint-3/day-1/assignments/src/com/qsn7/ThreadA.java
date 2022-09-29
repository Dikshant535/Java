package com.qsn7;

public class ThreadA implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			
			System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread().getName());
			
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		ThreadA t = new ThreadA();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.setName("Dhoni Thread");
		t2.setName("Kholi Thread");
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
	
	}

	
	

}
