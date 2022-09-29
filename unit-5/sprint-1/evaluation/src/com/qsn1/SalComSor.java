package com.qsn1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SalComSor implements Comparator<Map.Entry<Employee, String>>{

	@Override
	public int compare(Entry<Employee, String> o1, Entry<Employee, String> o2) {
		// TODO Auto-generated method stub
		
		if(o1.getKey().getSalary()>o2.getKey().getSalary()) {
			return 1 ;
		}else
			return -1;
		
	}
	
	
	

}
