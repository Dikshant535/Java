package com.qsn3;

public class Main {

	
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		ThreadB tb =new ThreadB(ta);
		
		ta.start();
		tb.start();
		
		
		
		
	}
}
