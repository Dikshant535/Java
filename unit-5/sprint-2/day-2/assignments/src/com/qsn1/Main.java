package com.qsn1;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a1;
		try {
			
			a1 = new Tiger();
			a1.eat();
			
		} catch (AnimalException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}
	
	
}
