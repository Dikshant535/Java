package com.qsn3;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<Student> students = new TreeSet<>();
		
		students.add(new Student(1, "name1", 100, 100, 100));
		students.add(new Student(2, "name2", 10, 101, 150));
		students.add(new Student(3, "name3", 90, 102, 70));
		students.add(new Student(4, "name4", 80, 103, 95));

		for(Student i:students) {
			System.out.println(i);
		}
	}

}
