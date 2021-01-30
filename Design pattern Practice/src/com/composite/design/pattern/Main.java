package com.composite.design.pattern;

public class Main {
	public static void main(String a[]) {
		Component mb=new Leaf("mother board",4000);
		Component mo=new Leaf("monitor",5000);
		Component ke=new Leaf("keyboard",500);
		Component hd=new Leaf("HDD",3000);
		Component rm=new Leaf("RAM",3500);
		Component cpu=new Leaf("CPU",8000);
		
		Composite com=new Composite("computer");
		Composite cab=new Composite("cabinate");
		Composite per=new Composite("periperal");
		Composite mot=new Composite("mother board");
		
		com.addComponent(per);
		com.addComponent(cab);
	
		per.addComponent(ke);
		per.addComponent(mo);
		
		cab.addComponent(mb);
		cab.addComponent(hd);
		cab.addComponent(mot);
		
		
		mot.addComponent(rm);
		mot.addComponent(cpu);
		
		
		com.showPrice();
		
		
	}
}
