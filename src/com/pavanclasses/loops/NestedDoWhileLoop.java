package com.pavanclasses.loops;

public class NestedDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		do {

			int j = 0;

			do {
				System.out.print(j + "  ");
				j++;
			} while (j <= 10);

			System.out.println(i);
			i++;
		} while (i <= 10);
	}
}
