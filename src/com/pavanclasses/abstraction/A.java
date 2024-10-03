package com.pavanclasses.abstraction;

abstract class A {
	void m1() {
		System.out.println("m1 Method");

	}

	void m2() {
		System.out.println("m2 Method");

	}

abstract void m3() ;
	
	

abstract void m4 ();
}



class B extends A{
	@Override
	void m3(){
		
		System.out.println("m3 Method");
		
		
	}

	@Override
	void m4() {
		// TODO Auto-generated method stub
		System.out.println("M4 method");
	}
	
	
	
	
	
}