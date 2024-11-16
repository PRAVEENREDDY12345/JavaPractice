package com.pavanclasses.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> l = new LinkedList<>();
		
		for (int i = 0; i< 1000; i++) {
			
			l.add(i);}
			System.out.println(l);

		

		int in = l.get(500);
		System.out.println(in);
	}

}
