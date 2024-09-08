package com.pavanclasses.methods;

public class StaticWithoutReturnWithParameters {

	public static void m1 (int i) {
		
		System.out.println(i);
	}
public static void m2 (int i, int j) {
		
		System.out.println("sum is " + (i+j));
	}

public static void m3 (String s, int i, int j) {
	
	System.out.println( s+" has "+(i+j)+" days ");
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticWithoutReturnWithParameters.m1(10);
		StaticWithoutReturnWithParameters.m2(10, 20);
		StaticWithoutReturnWithParameters.m3("Praveen", 10, 20);
		
	}

}
