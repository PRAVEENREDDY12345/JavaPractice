package com.pavanclasses.collections;

import java.util.HashSet;
import java.util.Set;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<>();

		s.add("Abbas");
		s.add("Naresh");
		s.add("Anil");
		System.out.println(s);

		Set<String> s1 = new HashSet<String>();
		s1.add("AAA");
		s1.add("BBB");
		System.out.println(s1);

		System.out.println(s.addAll(s1));
	}

}
