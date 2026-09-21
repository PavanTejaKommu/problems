package com.strings;

public class Program3 {
	public static void main(String[] args) {
		String str = "java is easy";
		
		
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println("Element : "+str.charAt(i));
				break;
			}
			
		}
	}

}
