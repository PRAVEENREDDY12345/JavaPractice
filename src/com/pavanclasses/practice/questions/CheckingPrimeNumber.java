package com.pavanclasses.practice.questions;

public class CheckingPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 41;
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
		} else {

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}

	}
}
