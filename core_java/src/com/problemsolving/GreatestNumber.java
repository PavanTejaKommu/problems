package com.problemsolving;

public class GreatestNumber {
	public static void main(String[] args) {
		Math.max(2, 5);
		Math.min(2, 5);
	int val =	Math.abs(23);
	System.out.println(val);
	
	// Gretest Value 
	int a = 30;
	int b = 20;
	
	int g = (a+b+Math.abs(a-b))/2;
	System.out.println(g);
	
	int c = 10;
	int d = 30;
	
	// without using * operator 
	int e = 3;
	int f = 3;
	System.out.println(e>>f);
	}

}
