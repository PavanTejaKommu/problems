package com.variableAssignment;

public class StaticMethodPractice {
	
	
	public  static void add(int a , int b) {
		System.out.println("addition of "+a+" and "+ b+ "       = "+( a+b));
	}

	public  static void sub(int x, int y) {
		System.out.println("substraction of " +x+" and "+y+ "   = " + (y-x));
	}
	
	public  static void mul(int m , int n) {
		System.out.println("multiplication of "+m+" and "+n+" = " + (m*n));
	}
	
	public static void div(int r, int s) {
		System.out.println("division of "+r+ " and "+s+"       = " + (r/s));
	}
	public static void main(String[] args) {
		StaticMethodPractice sm = new StaticMethodPractice();
		sm.add(10, 20);
		sm.sub(20, 30);
		sm.mul(10, 20);
		sm.div(20, 10);
		

		
		
	}

}
