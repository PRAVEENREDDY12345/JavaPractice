package com.pavanclasses.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();	
		 l.add("Praveen");
		 l.add("Bhanu");
		 l.add("Abbas");
		 l.add("Naresh");
		 l.add(100);
		 l.add('B');
		 l.add("Praveen");
		 l.add("Bhanu");
		 l.add(null);
		 l.add(null);
		 l.add(null);
		 System.out.println(l);
		 
		 
		 System.out.println("*********************************************");
		 
		 Set s = new HashSet();
		 
		 s.add("Praveen");
		 s.add("Bhanu");
		 s.add("Abbas");
		 s.add("Naresh");
		 s.add(100);
		 s.add('B');
		 s.add(null);
		 s.add(null);
		 s.add(null);
		 s.add("Praveen");
		 s.add("Bhanu");
		 
			System.out.println(s);
	}

}
