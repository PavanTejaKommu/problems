package com.dataTypes;

public class CorrectingErrors {

	public static void main(String[] args) {

	
		
		short age = 200;
		System.out.println(" byte range is only -128 to 127. Value 200 is outside byte range, so use short. \n");
		
		float percentage = 85.5f;
		System.out.println(" Added f because Java treats decimal numbers as double by default \n");
		
		char grade = 'A';
		System.out.println(" char stores a single character and uses single quotes (' '). Double quotes are for String. \n");
		
		boolean status = true;
		System.out.println(" boolean stores only true or false values, not text/String values.  \n");
		
		long mobileNumber = 9876543210L;
		System.out.println(" The number is greater than int range, so add L to represent a long value.  ");
		
		
	}

}
