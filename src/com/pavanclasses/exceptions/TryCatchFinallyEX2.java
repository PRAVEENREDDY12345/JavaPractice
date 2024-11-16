package com.pavanclasses.exceptions;

public class TryCatchFinallyEX2 {

	@SuppressWarnings("finally")
	public int value () {
		// TODO Auto-generated method stub

try {
	int i = 990;
	int j = 0;
	int k = i/j;
	return k;
} catch (Exception e) {
	// TODO: handle exception
	return 30;
	
}finally {
	return 40;
}
	}

}
