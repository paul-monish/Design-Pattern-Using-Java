package com.adapter.design.pattern;



public class Main {

	public static void main(String[] args) {
		Pen p=new PenAdapter();
		Assignement a=new Assignement();
		a.writeAssignment(p);
		

	}

}
