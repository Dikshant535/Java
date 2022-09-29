package com.qsn3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	
	public static void main(String[] args) {
		
		MyCall[] prodcts = {
				new MyCall(5),
				new MyCall(6),
				new MyCall(7),
				new MyCall(8),
				new MyCall(15),
				new MyCall(4)
		};
		
		
		
		ExecutorService ser = Executors.newFixedThreadPool(3);
		
		for(MyCall i : prodcts) {
			
			Future<Integer> f = ser.submit(i);
			
			try {
				System.out.println("Products is : "+f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
 		
		
	}
	
}
