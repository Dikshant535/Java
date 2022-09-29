package com.qsn2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	
	
	public static void main(String[] args) {
		
//		Predicate
		System.out.println("Predicate Example");
		Predicate<Student> s1 = s -> s.getMarks()<500;
		
		System.out.println(s1.test(new Student(1, "Sam", 300)));
		
		System.out.println();
		
		System.out.println("Consumer Example");
		Consumer<Student> s2 = s -> System.out.println(s);
		
		s2.accept(new Student(2, "Hem", 500));
		System.out.println();
		
		System.out.println("Supplier Example");
		
		Supplier<String> s3 = () -> "Inside from LE";
		System.out.println(s3.get());
		System.out.println();
		
		System.out.println("Function Example");
		
		Function<Student, String> s4 = s -> s.getMarks()>500? "Pass":"Fail";
		
		System.out.println(s4.apply(new Student(7, "Rona", 501)));
			
	}
	
	
	
	
}
