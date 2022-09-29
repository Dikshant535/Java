package com.qsn3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("Uttarakhand", "Dehradun");
		lhm.put("Punjab", "Chandhighar");
		lhm.put("Haryana", "Chandhighar");
		lhm.put("Rajasthan", "Jaipur");
		lhm.put("Karnataka", "Banglore");
		
//		Set<Map.E> =lhm.entrySet();
		Set<Map.Entry<String, String>> fs = lhm.entrySet();
		
		for(Map.Entry<String, String> i:fs) {
			
			System.out.println("State is :"+i.getKey());
			System.out.println();
			System.out.println("Capital is :"+i.getValue());
			System.out.println("============================");
		}
		
	}
	
	
}
