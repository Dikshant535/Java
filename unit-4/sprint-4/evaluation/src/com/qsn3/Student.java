package com.qsn3;

public class Student implements Comparable<Student>{
	
//	rollNo, name, mathsMarks, scienceMarks, engMarks.
	private int rollNo ;
	private String name;
	private int mathsMarks ;
	private int scienceMarks ;
	private int engMarks ;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	
	
	public int getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	
	
	public int getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	
	
	
	public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
	}
	@Override
	public int compareTo(Student o) {
		
		double marks = this.getEngMarks()+this.getMathsMarks()+this.getScienceMarks();
		double marks1 = o.getEngMarks()+o.getMathsMarks()+o.getScienceMarks();
		
		if(marks>marks1)return 1;
		else if(marks==marks1) {
			if(this.getName().equals(o.getName())) {
				
				if(this.getRollNo()<o.getRollNo()) return 1;
				else return -1;
			}else return (o.getName().compareTo(this.getName()));
				
			
		}
		else return -1;
//		return 0;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}
	
	
	
	
}
