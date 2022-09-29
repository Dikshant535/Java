package com.qsn2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		cities.add("Delhi");
		cities.add("Chandighar");
		cities.add("Punjab");
		cities.add("A.P");
		cities.add("Bangluru");
		
		
		Collections.sort(cities,(s1,s2) -> s2.compareTo(s1));
		
		System.out.println(cities);
		
		
		
	}
	
}
