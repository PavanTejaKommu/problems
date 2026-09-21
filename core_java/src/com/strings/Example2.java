package com.strings;

public class Example2 {

	
	public static void main(String[] args) {
		
		String str = "java is easy and flexible language";
		
		int vowels =0;
		int consonents =0;
		
		
		for(int i =0; i < str.length();i++) {
			char ch = str.charAt(i);
			
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}else {
				consonents++;
			}
		}
		System.out.println("Vowels : "+vowels);
		System.out.println("Consonenets : "+consonents);
		
	}
	
}
