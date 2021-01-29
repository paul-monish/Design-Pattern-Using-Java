package com.builder.design.pattern;

public class BuilderDesignPattern {
	private String os;
	private String brand;
	private int ram;
	private int size;
	private String battery;
	
	
	public BuilderDesignPattern setOs(String os) {
		this.os = os;
		return this;
	}
	public BuilderDesignPattern setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public BuilderDesignPattern setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public BuilderDesignPattern setSize(int size) {
		this.size = size;
		return this;
	}
	public BuilderDesignPattern setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, brand, ram, size, battery);
	}
	

}
