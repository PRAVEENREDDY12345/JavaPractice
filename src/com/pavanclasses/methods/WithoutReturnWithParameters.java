package com.pavanclasses.methods;
/*
 * 
 * Instance method : WithoutReturnWithParameters
 * 
 */
public class WithoutReturnWithParameters {
/*
 * 
 * 
 * 
 */
	public void m1 (int i) {
		
		System.out.println(i);
	}
	
	
	public void m2(int i, int j) {
		
		System.out.println("Sum = "+ (i+j));
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutReturnWithParameters ref = new WithoutReturnWithParameters();
		ref.m1(100);
		ref.m2(100,200);
		
	}

}
