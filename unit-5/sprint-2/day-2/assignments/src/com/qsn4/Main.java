package com.qsn4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		cities.add("Delhi");
		cities.add("Chandhighar");
		cities.add("Punjab");
		cities.add("A.P");
		cities.add("Banguluru");
		
		PrintList p = c -> {
			
			for(String i:c) {
				System.out.println(i);
			}
			
		};
		
		p.display(cities);
		
		
		
	}

	
	
	
}
