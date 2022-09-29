package com.qsn4;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Main {
	
	public static HashMap<String,Student> sort(HashMap<String,Student> hm){
		
		
		List<Map.Entry<String,Student>> l = new LinkedList<>(hm.entrySet());
		
		Collections.sort(l,new MarkCompSor());
		
		
		HashMap<String, Student> hmm = new LinkedHashMap();
		
		for(Map.Entry<String,Student> y:l) {
			hmm.put(y.getKey(),y.getValue());
		}
		
		
		
		return hmm;
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("utt", new Student(10, "n1", 450));
		hm.put("hr", new Student(11, "n1", 750));
		hm.put("pun", new Student(12, "n1", 550));
		hm.put("kar", new Student(13, "n1", 350));
		
		
		Map<String,Student> t = sort(hm);
		
		Set<Map.Entry<String, Student>> re = t.entrySet();
		
		for(Map.Entry<String, Student> o:re) {
			
			System.out.println(o.getKey());
			System.out.println(o.getValue());
			System.out.println("==========================");
		}
		
	}
	
	
}
