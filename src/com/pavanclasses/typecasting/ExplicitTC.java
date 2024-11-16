package com.pavanclasses.typecasting;

public class ExplicitTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 100.0;
		System.out.println("double d ="+ d);
		float f = (float) d;
		System.out.println("float  f ="+ f);
		long l= (long) f;
		System.out.println("long  l ="+ l);
		int i = (int) l;
		System.out.println("int  i ="+ i);
		char c = (char) i;
		System.out.println("Char  c ="+ c);
		short s = (short) c;
		System.out.println("short  s ="+ s);
		byte b =(byte) s;
		System.out.println("byte b ="+ b);
		
		
		
		
	}

}
