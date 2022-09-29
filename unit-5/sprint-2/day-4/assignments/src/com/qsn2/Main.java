package com.qsn2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "n1", 250));
		students.add(new Student(2, "n2", 750));
		students.add(new Student(3, "n3", 350));
		students.add(new Student(4, "n4", 150));
		students.add(new Student(5, "n5", 550));
		
		Student maxmarks = students.stream().max((s1,s2) -> s1.getMarks()>s2.getMarks() ? 1:-1).get();
		System.out.println("Maximum marks score by student");
		System.out.println(maxmarks);
		
	}

}
