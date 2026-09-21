package com.strings;

public class Program2 {
	public static void main(String[] args) {
		String str = " java is easy ";
		
		int spaceCount=0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch ==' ') {
				
				spaceCount++;
			}
		}
		System.out.println("Space Count : "+spaceCount);
	}

}
