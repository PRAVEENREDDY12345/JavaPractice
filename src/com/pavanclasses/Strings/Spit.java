package com.pavanclasses.Strings;

import java.util.Arrays;

public class Spit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Java is a programming language";

String [] result = str.split("");

for (String s : result) {
	
	
	System.out.println(s);
}
	
	System.out.println(Arrays.toString(result));
	}

}
