package com.factory.design.pattern;
public class FcatoryDesignPatttern {
	public Os getInstance(String str) {
		if(str.equals("android"))
			return new Android();
		else if(str.equals("windows"))
			return new Windows();
		else
			return new IOS();
	}
}
