package com.pavanclasses.methods;
/*   
 * 
 * Instance Method : With Return Type And Without Parameters
 * 
 * 
 */
public class WithReturnTypeAndWithoutParameters {
/*
 * 
 * @ return the int;
 * 
 */
	public int m1() {
		
		return 1000;
	}
	
	
	/*
	 * 
	 * 
	 * @return Char
	 */
	
	public char m2() {
		
		return 'C';
	}
	
	/*
	 * Return String
	 * 
	 * 
	 * 
	 */
	public String m3() {
		
		
		return "Hi Good Mornng";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithReturnTypeAndWithoutParameters ref = new WithReturnTypeAndWithoutParameters();
		int i = ref.m1();
		System.out.println(i);
		char ch = ref.m2();
		System.out.println(ch);
		String s = ref.m3();
		System.out.println(s);
	}

}
