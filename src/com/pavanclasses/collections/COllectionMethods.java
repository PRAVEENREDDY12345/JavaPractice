package com.pavanclasses.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class COllectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();

		l.add("Naresh");
		l.add("abbas");
		l.add("anil");

		System.out.println(l);

		System.out.println(l.add("Naresh"));
		System.out.println(l);

		System.out.println("***************************");

		Set<String> s = new HashSet<>();

		s.add("Naresh");
		s.add("abbas");
		s.add("anil");
		System.out.println(s);

		System.out.println(s.add("Naresh"));
		System.out.println(s.add("Praveen"));
		System.out.println(s);

	}

}
