package com.pavanclasses.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;
		int c = 13;
		int i = (a > b) ? a : b;

		System.out.println(i);
		boolean j = (c > b) ? true : false;
		System.out.println(j);
		char k = (a == c) ? 'A' : 'B';
		System.out.println(k);
		double l = (c >= a) ? 0.1 : 0.5;
		System.out.println(l);
		String m = !(c == a)? "Happy":"Unhappy";
		System.out.println(m);
	}

}
