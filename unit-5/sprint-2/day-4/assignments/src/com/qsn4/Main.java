package com.qsn4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;



public class Main {
	
	public static void main(String[] args) {
		
        Set<Student> students = new HashSet<>();
		
		students.add(new Student(1, "n1", 250));
		students.add(new Student(2, "n2", 750));
		students.add(new Student(3, "n3", 350));
		students.add(new Student(1, "n1", 250));
		students.add(new Student(5, "n5", 550));
		
		
		System.out.println(students);
		
		Stream<Student> ss = students.stream().filter(s -> s.getMarks()<500);
		
		ss.forEach(s->System.out.println(s));
		
	}
	
	
}
