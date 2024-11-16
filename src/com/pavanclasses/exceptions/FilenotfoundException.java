package com.pavanclasses.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilenotfoundException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
FileInputStream file = new FileInputStream("C:\\Users\\56851\\Downloads\\propertya.csv");


System.out.println(file);
	}

}
