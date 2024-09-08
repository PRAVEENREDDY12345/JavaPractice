package com.pavanclasses.methods;
/*
 * Static Method With Return Type And Without Parameters
 * 
 * 
 */
public class StaticWithReturnTypeAndWithoutParameters {
	
	public static int m1 () {
		int i =10;
		
		int j = 20;
		int k =i+j;
		
		return k;
	}
	
	public static String m2() {
		
		int i = 10;
		int j = 20;
		
		String s = "Praveen need to travel "+(i+j)+" kms in Vehicle"; 
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = StaticWithReturnTypeAndWithoutParameters.m1();
	System.out.println(m);
	String p= StaticWithReturnTypeAndWithoutParameters.m2();
	System.out.println(p);
	}

}
