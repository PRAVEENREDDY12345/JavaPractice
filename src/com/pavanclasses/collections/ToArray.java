package com.pavanclasses.collections;

import java.util.HashSet;
import java.util.Set;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set <String> s = new HashSet<>();

s.add("Praveen");
s.add("Vyshnavi");
s.add("Simha");
System.out.println(s);

Object[]arr = s.toArray();
for (Object obj :arr) {
	
	System.out.println(obj);
}	
	
	for (int i = 0; i< arr.length; i++) {
		
		System.out.println(arr[i]);
	}
	
}

	}


