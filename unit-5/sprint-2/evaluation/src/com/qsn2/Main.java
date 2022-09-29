package com.qsn2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		
//		1) Predicate  :------
		
		Predicate<Student> pre =s -> s.getMarks()>500 ;
		
		System.out.println("Predicate Implemantation");
		System.out.println(pre.test(new Student(1, "n1", 430)));
		
		System.out.println("========================================");
		
		
//		2) Consumer :------------------------
		
		
		Consumer<Student> con = s -> System.out.println(s);
		
		System.out.println("Consumer Implemantation");
		con.accept(new Student(2, "Sam", 480));
		
		System.out.println("========================================");
		
//		3) Supplier   :-----------------
		
		
		Supplier<Student> supp = () -> {
			return new Student(3, "Kamal", 350);
		};
		
		System.out.println("Supplier Implemantation");
		System.out.println(supp.get());
		
		System.out.println("========================================");
		
		
//		4) Function   :------------------
		
		
		Function<String, Integer> fun = s ->  Integer.parseInt(s);
		
		
		System.out.println("Function Implemantation");
		System.out.println(fun.apply("7")+10);
		
		System.out.println("========================================");
		
	}
	
	
}
