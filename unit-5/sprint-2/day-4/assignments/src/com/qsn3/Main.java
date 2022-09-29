package com.qsn3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		List<Integer> finallist = list.stream().map(n -> n*n).collect(Collectors.toList());
		
		
		System.out.println("Original List.....");
		for(int i :list) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("============================================");
		System.out.println("Final List.....");
		for(int i :finallist) {
			
			System.out.print(i+" ");
		}
		
		
	}

}
