package com.qsn4;

public class Car {
	
	private String model;
	private String companyName;
	private String color;
	private Engine engine;
	
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car(String model,String companyName,String color,Engine engine) {
		Engine en = new Engine();
		this.model=model;
		this.companyName=companyName;
		this.color=color;
		this.engine=en;
	}
	
	public Car() {
		Engine en = new Engine();
		this.engine=en;
	}
	
}
