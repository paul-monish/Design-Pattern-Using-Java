package com.builder.design.pattern;

public class Phone {
	private String os;
	private String brand;
	private int ram;
	private int size;
	private String battery;
	public Phone(String os, String brand, int ram, int size, String battery) {
		super();
		this.os = os;
		this.brand = brand;
		this.ram = ram;
		this.size = size;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", brand=" + brand + ", ram=" + ram + ", size=" + size + ", battery=" + battery
				+ "]";
	}

	
	
}
