package com.qsn1;

public class Student extends Person {
	

	private int studentId ;
	private String courseEnrolled ;
	private int courseFee ;
	
	
//	public Student(Address a, String name, String gender, int studentId, String courseEnrolled, int courseFee) {
//		super(a, name, gender);
//		this.studentId = studentId;
//		this.courseEnrolled = courseEnrolled;
//		this.courseFee = courseFee;
//	}
	
	
	@Override
	public String toString() {
		
		
		return ("student"+"["+"studentId="+this.getStudentId()+","+"courseFee="+this.getCourseFee()+","+"courseEnrolled="+this.getCourseEnrolled()+","+"address="+"Address"+"["+"city="+this.getAddress().getCity()+","+"state="+this.getAddress().getState()+","+"pincode="+this.getAddress().getPinCode()+"]"+"]");
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	
	
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	
	
}
