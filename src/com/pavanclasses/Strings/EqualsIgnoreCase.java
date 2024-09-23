package com.pavanclasses.Strings;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ankireddypalli praveen kumar reddy";
		
		String s1 = "ANKIREDDYPALLI PRAVEEN KUMAR REDDY";
		boolean b = s.equalsIgnoreCase(s1);
		System.out.println(b);
		
	}

}
