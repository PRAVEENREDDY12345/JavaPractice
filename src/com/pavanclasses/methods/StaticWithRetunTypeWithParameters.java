package com.pavanclasses.methods;

/*
 * 
 * Static Method
 * 
 */
public class StaticWithRetunTypeWithParameters {
	/*
	 * Return type added
	 * 
	 */

	public static int m1(int i) {

		return i;
	}

	public static int m2(int i, int j) {

		int k = i + j;
		return k;

	}

	public static String m3(int i, int j, String s) {

		String str = s + "  has " + (i + j) + "  Vehicles  ";

		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = StaticWithRetunTypeWithParameters.m1(10);
		System.out.println(j);

		int k = StaticWithRetunTypeWithParameters.m2(10, 20);
		System.out.println(k);
		
		String desc = StaticWithRetunTypeWithParameters.m3(10, 20, "Praveen");
		System.out.println(desc);
	}

}
