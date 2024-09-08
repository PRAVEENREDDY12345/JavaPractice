package com.pavanclasses.methods;
/***
 * 
 * Instance method With Retun Type With Parameters
 * 
 * 
 */
public class WithRetunTypeWithParameters {

	/*
	 * 
	 * Return
	 * 
	 */
	
	
	public int m1(int i, int j, int k) {
		
		
		return i+j+k;
	}
	
	public String m2 ( int i, String j) { 
		
		
		String str = String.valueOf(i)+j;
		return str;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithRetunTypeWithParameters ref = new WithRetunTypeWithParameters();
		int sum = ref.m1(100, 200, 300);
		System.out.println(sum);
		
		String a = ref.m2(10, "Digits");
		System.out.println(a);
	}

}
