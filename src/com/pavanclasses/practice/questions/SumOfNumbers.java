package com.pavanclasses.practice.questions;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 1245;
int sum = 0;

while (i>0) {
	
	sum += i %10;
	i = i/10;
	
}
	System.out.println(sum);

	}

}
