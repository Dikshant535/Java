package com.qsn4;

public class Engine {
	
	private int rpm;
	private int power;
	private String manufacturer;
	private boolean hasTurbo;
	
	public void makeTurbo() {
		this.hasTurbo=true;
	}
	
	public int getRpm() {
		return rpm;
	}
	
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public boolean getHasTurbo() {
		return hasTurbo;
	}
	
	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = false;
	}
	
	public Engine(int rpm,int power,String manufacturer,boolean hasTurbo) {
		this.rpm = rpm;
		this.power = power;
		this.manufacturer=manufacturer;
		this.hasTurbo = hasTurbo;
	}
	public Engine() {
		
	}
	
}
