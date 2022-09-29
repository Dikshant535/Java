package com.qsn1;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){ 
		
		Set<Map.Entry<Employee,String>> st =originalMap.entrySet();
		
		List<Map.Entry<Employee, String>> li = new LinkedList<>(st) ;
		
		Collections.sort(li,new SalComSor());
		
		
		HashMap<Employee, String> re = new LinkedHashMap();
		for(Map.Entry<Employee, String> j : li) {
			
			re.put(j.getKey(), j.getValue());
			
		}
		
		
		return re ;
	}
	
	public static void main(String[] args) {
		
		HashMap<Employee, String> hmp = new HashMap<>();
		
		hmp.put(new Employee(1, "n1", 80000), "Delhi");
		hmp.put(new Employee(2, "n2", 20000), "Punjab");
		hmp.put(new Employee(3, "n3", 60000), "Haryana");
		hmp.put(new Employee(4, "n4", 10000), "Uttarkhand");
		
		Demo d = new Demo();
		
		Map<Employee, String> mp = d.sortMapUsingEmployeeSalary(hmp);
		
		Set<Map.Entry<Employee, String>> fi = mp.entrySet();
		
		for(Map.Entry<Employee, String> a : fi) {
			System.out.println();
			System.out.println(a.getKey());
			System.out.println(a.getValue());
			System.out.println("==============================================");
			
		}
	}
	
	
}
