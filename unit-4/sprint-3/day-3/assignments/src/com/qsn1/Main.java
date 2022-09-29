package com.qsn1;

public class Main {
	
	public static Person generatePerson(Person person) {
		if(person!=null) {
			person.setName("Dikshant");
			person.setGender("Male");
			Address address = person.getAddress();
			address.setCity("Nainital");
			address.setState("Uttrakhand");
			address.setPinCode("2633645");
			if(person instanceof Student) {
				Student ss = (Student)person;
				
				ss.setStudentId(777);
				ss.setCourseFee(40000000);
				ss.setCourseEnrolled("FullStack");
				ss.toString();
			}else {
				Instructor ii = (Instructor)person;
				ii.setInstructorId(111);
				ii.setSalary(700000);
				ii.toString();
			}
			
		}	
		
		
		return person;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Person i = generatePerson(new Instructor());
		
		Person s = generatePerson(new Student());
			
		System.out.println(i);
		System.out.println(s);
		
		
	}

}
 