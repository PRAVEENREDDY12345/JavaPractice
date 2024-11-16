package com.pavanclasses.collections;

import java.util.HashSet;
import java.util.Set;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set <String> s = new HashSet<>();
		
		s.add("Krishna");
		s.add("Thulasi");
		s.add("Abhi");
		s.add("Sai");
		
		if (s.contains("Sai")) {
			
			System.out.println("Sai is in the list l");
		}
		int sizeOfSet = s.size();
		
		System.out.println("Size of Set s = "+sizeOfSet);
		if (s.isEmpty()) {
			
			System.out.println("Set s is Empty");
			
		}else {
			
			System.out.println("Set s is not Empty where size is "+sizeOfSet);
		}
	}

}
