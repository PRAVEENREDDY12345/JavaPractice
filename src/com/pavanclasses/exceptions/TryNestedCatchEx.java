package com.pavanclasses.exceptions;

public class TryNestedCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Before the try Block");
try {
	int i = 1999;
	int j = 0;
	int k = i/j;
	
} catch (ArithmeticException e) {
	// TODO: handle exception
	
	System.out.println("Number is not divisable by zero"+e.getMessage());
}catch (NullPointerException e) {
	// TODO: handle exception
	System.out.println("Null Pointer exception "+e.getMessage());
}catch (Exception e) {
	// TODO: handle exception
	System.out.println(e.getMessage());
}
	
	}

}
