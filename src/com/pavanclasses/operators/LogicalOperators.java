package com.pavanclasses.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int c = 30;
		//   false && false  ---> false 
		if ((a>b)&&(b>c)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//   true && false   ----> false
		if (!(a>b)&&(b>c)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	      //   true && true   ----> true
		if (!(a>b)&&!(b>c)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//   false || false -----> false 
		if ((a>b)||(b>c)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// false || true ------> true
		if ((a>b)||!(b>c)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
