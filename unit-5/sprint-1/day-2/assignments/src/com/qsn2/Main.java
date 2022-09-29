package com.qsn2;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<Student, String> hm = new TreeMap<>(new StudentMarksComp());
		
		hm.put(new Student(10,"n1",350), "ut");
		hm.put(new Student(11,"n2",650), "ut");
		hm.put(new Student(12,"n3",450), "ut");
		hm.put(new Student(13,"n4",250), "ut");
		
		List<Map.Entry<Student, String>> ll = new LinkedList<>(hm.entrySet());
			
		for(Map.Entry<Student, String> l: ll) {
			
			System.out.println(l.getKey());
			System.out.println(l.getValue());
			System.out.println("================================");
		}
	}
	
	
}
