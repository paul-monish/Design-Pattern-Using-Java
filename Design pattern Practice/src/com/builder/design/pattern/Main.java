package com.builder.design.pattern;

public class Main {

	public static void main(String[] args) {
		System.out.println(new BuilderDesignPattern().setOs("android").setBattery("3000").setRam(8).getPhone());

	}

}
