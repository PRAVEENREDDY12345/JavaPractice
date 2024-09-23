package com.pavanclasses.Strings;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = new String ("abc");
		String s2 = new String("def");
		String s3 = new String ("abc");
		String s4 = new String ("ABC");
		
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		

	}

}
