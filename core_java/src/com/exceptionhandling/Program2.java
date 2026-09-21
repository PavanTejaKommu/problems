package com.exceptionhandling;

public class Program2 {
	public static void main(String[] args) {
		String str = null;
		
		
		
		try {
			System.out.println(str.toUpperCase());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
//		e.printStackTrace();
		}
		
		
		
		try {
			System.out.println(str.toUpperCase());
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
//		e.printStackTrace();
		}
		
		
		try {
			System.out.println(str.toUpperCase());
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
//		e.printStackTrace();
		}
		
		
		
		System.out.println("Executed ");
	}

}
