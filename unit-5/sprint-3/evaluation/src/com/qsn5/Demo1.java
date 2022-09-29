package com.qsn5;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student(1, "n1", 350, "as@gmail.com", "123", new Address("Maharastra", "Nasik", "123654"));
		Student s2 = new Student(2, "n2", 450, "aa@gmail.com", "321", new Address("Uttarakhand", "Dehradoon", "123654"));
		Student s3 = new Student(3, "n3", 550, "as@gmail.com", "456", new Address("Rajhasthan", "Jaipur", "123654"));
		Student s4 = new Student(4, "n4", 650, "ad@gmail.com", "654", new Address("Haryana", "Panipat", "123654"));
		Student s5 = new Student(5, "n5", 750, "af@gmail.com", "987", new Address("Punjab", "Chandhighar", "123654"));
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		
		
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		oos.flush();
		oos.close();
		System.out.println("Sucessfully done");
		
	}

		
	
}
