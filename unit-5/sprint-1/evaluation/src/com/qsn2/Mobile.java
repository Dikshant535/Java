package com.qsn2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mobile {

	public HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		
			int flag = 0;
			ArrayList<String> li = new ArrayList<>();
			
			if(mobiles.size()==0) {
				li.add(model);
				mobiles.put(company, li);
				return("Mobile added successfully");
				
			}else if(mobiles.size()!=0) {
				
				Set<Map.Entry<String, ArrayList<String>>> ss = mobiles.entrySet();
				
				for(Map.Entry<String, ArrayList<String>> l :ss) {
					flag =0 ;
					if(l.getKey().equals(company)) {
						
						l.getValue().add(model);
						return("Mobile added successfully");
					}else {
						
						
						flag=1;
					}
					
				}
				
				if(flag==1) {
					
					li.add(model);
					mobiles.put(company, li);
					return("Mobile added successfully");
					
				}
				
				
				
			}
			
		
		
		
		return null ;
	}
	
	public List<String> getModels(String company){
		
		Set<Map.Entry<String, ArrayList<String>>> dd = mobiles.entrySet();
		
		for(Map.Entry<String, ArrayList<String>> d : dd) {
			
			if(d.getKey().equals(company)) {
				
				return d.getValue();
			}
			
		}
		
		return null ;
	}
	
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		
		
		/////// Adding mobiles
		
		System.out.println(m.addMobile("apple", "Iphone13"));
		System.out.println(m.addMobile("mi", "Note7pro"));
		System.out.println(m.addMobile("samsung", "J7next"));
		System.out.println(m.addMobile("apple", "Iphone14"));
		System.out.println(m.addMobile("mi", "Note6pro"));
		
		
		
		
		// geting details of mobile acc. to model
		
		
		List<String> l1 = m.getModels("apple");
	
			
			try {
				
				System.out.println();
				System.out.println("List of Mobiles Model");
				for(String an : l1) {
					
					System.out.print(an+" ");
					System.out.println();
					System.out.println("==========================================");
					
				}
				
			}catch (NullPointerException e) {
				
				System.out.println(" Invalid Company Supplied");
			}
			
		
		
		
		
	}
	
}
