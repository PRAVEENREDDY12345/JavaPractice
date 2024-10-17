package com.pavanclasses.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new TreeSet();
		
		s.add("Praveen");
		s.add("Abbas");
		s.add("Naresh");
		s.add("Anil");
		s.add("Sai");
		System.out.println(s);
		
		
	
		List l = new ArrayList();
		
		l.add("Praveen");
		l.add("Abbas");
		l.add("Naresh");
		l.add("Anil");
		l.add(0,"Sai");
		
		System.out.println(l);
		
		}

}
