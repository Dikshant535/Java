package com.qsn1;

public class Emploee extends Person{
	
	private int pid;
	private String name ;
	
	
	
	
	@Override
	public String toString() {
		return "Emploee [pid=" + pid + ", name=" + name + "]";
	}
	
	
	public Emploee(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
