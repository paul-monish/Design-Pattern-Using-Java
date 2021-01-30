package com.composite.design.pattern;

import java.util.ArrayList;
import java.util.List;

interface Component{
	
	void showPrice() ;
	
}

class Leaf implements Component{
	String name;
	int price;
	
	public Leaf() {
		
	}
	
	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void showPrice() {
		System.out.println(name+" : "+price);
	}
	 
}
class Composite implements Component{
	String name;
	public Composite(String name) {
		super();
		this.name = name;
	}
	
	List<Component> com=new ArrayList<>();
	
	public void addComponent(Component c) {
		com.add(c);
	}
	
	@Override
	public void showPrice() {
		
		System.out.println(name);
		for(Component c:com) {
			c.showPrice();
			
		}
		
	} 
	
}
public class CompositeDesignPattern {

}
