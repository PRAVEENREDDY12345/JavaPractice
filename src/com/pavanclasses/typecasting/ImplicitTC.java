package com.pavanclasses.typecasting;

public class ImplicitTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 10;	
		
		System.out.println("byte  b = "+ b);
		
		short s = b;
		System.out.println("short   s = "+ s);
	//	char c = s;
			
		int i = s;
		System.out.println("int   i = "+ i);
		
		long l = i;
		System.out.println("long   l = "+ l);
		
		float f = l;
		System.out.println("float   f = "+ f);
		
		double d = f;
		System.out.println("double   d = "+ d);
		
		
	}

}
