package com.pavanclasses.list.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Directions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("Praveen");
		l.add("Abbas");
		l.add("naresh");
		l.add("Anil");
		l.add("Sai");
		l.add("Pavan");
		System.out.println(l);
		//Forward Order read element by Element
		ListIterator <String> listIterator = l.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("*************??????????????????***********");
		while (listIterator.hasPrevious()) {
			
	System.out.println(listIterator.previous());
		}
		System.out.println("********////////////////**********");
		while(listIterator.hasNext()) {
			
			System.out.println(listIterator.nextIndex()+"===> "+listIterator.next());
		}
		System.out.println("*******************////////////////***********");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previousIndex()+"==>"+listIterator.previous());
		}
	}

}
