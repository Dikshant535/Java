package com.qsn4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
		
	public static void main(String[] args) {
		
		List<String> original  = new ArrayList<>();
		
		original .add("sam");
		original .add("dikshu");
		original .add("ashu");
		original .add("rohit");
		original .add("salman");
		original .add("amithbah");
		original .add("sahruhk");
		original .add("arjun");
		original .add("kamal");
		original .add("yogi");
		
		List<String> transformed = original .stream().filter((s) -> (s.length()%2==0)).collect(Collectors.toList());
		
		transformed.sort((s1,s2) -> s2.compareTo(s1));
		System.out.println("transformed sort list");
		transformed.forEach(s -> System.out.println(s.toUpperCase()));
		System.out.println("====================================");
		
		
		
		System.out.println("original sort list");
		original.forEach(s -> System.out.println(s));
		
	}
	
	
}
