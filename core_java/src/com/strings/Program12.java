package com.strings;

import java.util.Arrays;

public class Program12 {
	
	
	public void automatic(String str ) {
		
	String arrStr[]	 = str.split(" ");
		System.out.println(arrStr.length);
		
	}
	
	
	public void manualCheck(String str ) {
		int count=1;
		
		for(int i =0; i < str.length();i++) {
			char ch = str.charAt(i);
			if(ch ==' ') {
				count++;
				
			}
		}
		System.out.println("Word Count : "+count);
	}
	
	
	public void doubleSpace(String str) {
		String arrWord [] = str.trim().split("\\s+");
		
		System.out.println(Arrays.toString(arrWord));
		
		System.out.println(arrWord.length);
	}
	public static void main(String[] args) {
		
		String str =  " Java  is easy      to learn ";
		
		Program12 obj = new Program12();
		
		obj.automatic(str);
		obj.manualCheck(str);
		obj.doubleSpace(str);
		
	
	}

}
