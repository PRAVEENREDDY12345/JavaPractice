package com.pavanclasses.polymorphism;

public class OverloadingTesting {
	
	public void testing () {
	System.out.println("Method with out parameters");	
		
	}
	public void testing (int i, int j) {
		
		
		System.out.println("Method with two parameters");	
System.out.println("i =" + i+ "j = "+j);
	}
	
	public void testing (String s, String s1) {
		
		System.out.println("Method with two String datatype parameters");
		
		System.out.println("String s ="+ s+"String s1 ="+ s1);
	}

}
