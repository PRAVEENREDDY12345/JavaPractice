package com.pavanclasses.operators;

public class RelationalOperator {

	/*
	 * 
	 * Relational Operator Example
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 40;
		int b = 20;
		int c = 30;

		if (a > b) {
			System.out.println("a>b");
		}
		if (b > c) {
			System.out.println("b>c");
		}
		if (a > c) {
			System.out.println("a>c");
		}
		if (c > a) {
			System.out.println("c>a");
		} else {
			System.out.println("not mached");
		}
		if (a <= b) {
			System.out.println("a<=b");
		}
		if (a != b) {
			System.out.println("a not equal to b");
		}
		if (a >= b) {
			System.out.println("a>=b");
		}
		if (a == b) {
			System.out.println("a is equal to b");
		}

	}

}
