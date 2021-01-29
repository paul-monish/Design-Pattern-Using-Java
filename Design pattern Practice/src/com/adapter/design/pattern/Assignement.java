package com.adapter.design.pattern;

public class Assignement {
	private Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}
	
	public void writeAssignment(Pen p) {
		p.write("now i am very sad..");
	}
}
