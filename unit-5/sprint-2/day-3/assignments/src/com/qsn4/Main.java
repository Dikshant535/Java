package com.qsn4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	
	public Map<String, Student>  sortMapUsingStudentName(Map<String, Student> originalMap){
		
//		Set<Map.Entry<String, Student>> s =originalMap.entrySet();
		List<Map.Entry<String, Student>> l = new ArrayList<>(originalMap.entrySet());
		
		Collections.sort(l,(s1,s2)->s1.getValue().getMarks()>s2.getValue().getMarks() ? 1:-1);
		
		LinkedHashMap<String, Student> lhm = new LinkedHashMap<>();
		for(Map.Entry<String, Student> i : l) {
			
			lhm.put(i.getKey(), i.getValue());
			
		}
		
		return lhm ;
	}
	
	public static void main(String[] args) {
		
		HashMap<String , Student> hm = new HashMap<>();
		
		hm.put("Delhi", new Student(1, "n1", "abc@gmail.com", 330));
		hm.put("Chandhighar", new Student(2, "n2", "abc@gmail.com", 530));
		hm.put("Pubjab", new Student(3, "n3", "abc@gmail.com", 430));
		hm.put("Dehradun", new Student(4, "n4", "abc@gmail.com", 230));
		hm.put("Delhi", new Student(5, "n5", "abc@gmail.com", 630));
		
		Main m = new Main();
		
		Map<String, Student> mp =m.sortMapUsingStudentName(hm);
		
		Set<Map.Entry<String, Student>> fs=mp.entrySet();
		
		for(Map.Entry<String, Student> k : fs) {
			
			System.out.println(k.getKey());
			System.out.println();
			System.out.println(k.getValue());
			System.out.println("========================================");
			System.out.println();
			
		}

	}

}
