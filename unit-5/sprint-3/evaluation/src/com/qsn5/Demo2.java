package com.qsn5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Desearilized
		FileInputStream fis = new FileInputStream("studentdata.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> li = (List<Student>)ois.readObject();
		
		System.out.println(li.size());
		li.forEach(s -> System.out.println(s)); // printing
		
//		Adding one more student details
		
		Student s6 = new Student(6, "n6", 850, "ag@gmail.com", "789", new Address("Up", "Lucknow", "123654"));
		
		
		FileOutputStream fos = new FileOutputStream("studentdata.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(li);
		oos.flush();
		oos.close();
		System.out.println("Sucessfully add one more student after deserialised");
		
	}
	
	
}
