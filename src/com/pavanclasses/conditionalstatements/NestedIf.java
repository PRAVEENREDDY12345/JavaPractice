package com.pavanclasses.conditionalstatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 8;
		int c = 5;
		int d = 4;
		int a = 3;

		if (a > b) {
			System.out.println(a + " is bigger than " + b);
			if (b > c) {
				System.out.println(b + " is bigger than " + c);
				if (c > d) {
					System.out.println(c + " is bigger than " + d);
				}
			}
		} else if (b > a) {
			System.out.println(b + " is bigger than " + a);
			if (c > b) {
				System.out.println(c + " is bigger than " + b);
				if (d > c) {
					System.out.println(d + " is bigger than " + c);

				}
			}
		} else if (a == b) {
			System.out.println(b + " is equals " + a);
			if (b == c) {
				System.out.println(b + " is equals " + c);
				if (c == d) {
					System.out.println(d + " is equals " + c);

				} else {
					System.out.println(d + " is not equals " + c);

				}
			}

		} else {
			System.out.println("all are not equal");
		}

	}

}
