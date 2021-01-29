package com.adapter.design.pattern;



public class Main {

	public static void main(String[] args) {
		//PilotPen pp=new PilotPen();
		Pen p=new PenAdapter();
		Assignement a=new Assignement();
		a.setP(p);
		a.writeAssignment("I am little bit try to implement pen interface");
		

	}

}
