package com.strings;

public class Example4 {
	
	public static void main(String[] args) {
		String str = "Teja";
		
		for(int i =str.length()-1;i>=0;i--) {
			
		str += 	 str.charAt(i);
		System.out.print(str.charAt(i));
			
		}
	}

}
