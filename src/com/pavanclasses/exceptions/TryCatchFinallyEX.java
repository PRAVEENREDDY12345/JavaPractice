package com.pavanclasses.exceptions;

public class TryCatchFinallyEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Befre try block");
try {
	int i = 100;
	int j = 0;
	int k = i/j;
	System.out.println("output is "+k);
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("exception occured "+e.getMessage());
}finally {
	System.out.println("infianlly");
}

}}