package com.qsn4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		
		HashMap<String, List<String>> hm = new HashMap<>();
		
		hm.put("Punjab", Arrays.asList("Ludhiana","Amritsar","Jalandhar"));
		hm.put("Uttarakhand", Arrays.asList("Dehradun","Haridwar","Rishikesh"));
		hm.put("Rajasthan ", Arrays.asList("Jaipur","Jaisalmer","Jodhpur"));
		hm.put("Haryana  ", Arrays.asList("Faridabad","Gurugram","Panipat"));
		
		Set<Map.Entry<String,List<String>>> s = hm.entrySet();
		
		LinkedList<Map.Entry<String,List<String>>> ls = new LinkedList<>(s);
		
		Collections.sort(ls,new StateCompSort());
		
		for(Map.Entry<String,List<String>> i :ls) {
			
			System.out.println("State name is : "+i.getKey());
			System.out.println();
			System.out.println("Cites are :- ");
			for(String l:i.getValue()) {
				
				System.out.println(l);
				
			}
			System.out.println("-----------------------------------");
			
		}
		
		
	}
	
}
