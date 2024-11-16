package com.pavanclasses.practice.questions;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input = 12345;
String s = Integer.toString(input);
String  stringReversed = "";



for (int i = s.length()-1;i>=0;i--) {
	
	stringReversed += s.charAt(i);
}
int reversed = Integer.parseInt(stringReversed);


System.out.println(reversed);
	}

}
