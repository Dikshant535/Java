package com.qsn1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> cityNames = new ArrayList<>();
		
		cityNames.add("Delhi");
		cityNames.add("Mumbai");
		cityNames.add("Chandhighar");
		cityNames.add("Dehradun");
		cityNames.add("Jaipur");
		
		Iterator iterator = cityNames.iterator();
		
		System.out.println("City Names are:-----");
		System.out.println("With the help of Iterator...");
		System.out.println();
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next()+" ");
			
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("With the help of For Loop...");
		System.out.println();
		for(int i=0;i<cityNames.size();i++) {
			
			System.out.print(cityNames.get(i)+" ");
			
		}
		
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("With the help of EnhancedFor Loop...");
		System.out.println();
		
		for(String s:cityNames) {
			
			System.out.print(s+" ");
			
		}
	}

}
