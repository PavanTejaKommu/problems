package com.strings;

public class Example3 {
	
	public static void main(String[] args) {
		
	
		
		String str = "Teja";
		String str2 = "teja";
		
		str.charAt(0);
		str.chars();
		str.codePointAt(0);
		str.codePointCount(0, 3);
		str.compareTo(str);
		str.compareToIgnoreCase(str2);
		str.concat(str2);
		str.contains(str2);
		str.contentEquals(str2);
		str.subSequence(0, 0);
		str.substring(0);
		str.substring(0, 0);
		
		
		String str3 = new String();
		
		System.out.println("Main started");
		
		
		
		
		System.out.println("Ended");
	}

}




/*
 * string 
 * we can store in two Heap area and scp
 * 
 * stringBuffer : introduced in java 
 * 
 * 
 * 
 * stringBuilder : introduced in java 1.5
 * we can store in only Heap memory .
 * StringBuilder sb = new StringBuilder
 * 
 * 
 * string
 * ----\
 * every time it creates new object 
 * 
 * string s = "java";
 * s,concat("hello");
 * s.concat("hii");
 * 
 * it takes more memory 
 * 
 * 
 * 
 * stringBuffer	`
 *
 * 
 * Thread Safety :
 * string : 
 * not a thread safety (immutable -> but safe for multiple threatds 
 * 
 * StringBuffer:
 * is a thread-safe and all methods synchronized 
 * 
 * 
 * stringBuilder:
 * is  not a thread safe and no methods are synchronized 
 * 
 * 
 * 
 * 5.performnace :
 * String:slow beacuse of object creation .
 * StringBuffer: faster then String.
 * Stringbuilder:faster then StringBuffer.
 * 
 * 6.whem to use :
 * 
 * string: constant msg's
 * 
 * when strings are not changes frequently .
 * 
 * ex: condstants , configurations , fixed messages etc.
 * 
 * 
 * StringBuffer:
 * We can go when changes constently and we want thread safety 
 * (it is mostly multithreaded).
 * 
 * 
 * StringBuilder:
 * we can go when we chage continuesly.
 * 
 * 
 * 
 * 


* */
