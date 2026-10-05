package com.arrays;

public class Program12 {
	public static void main(String[] args) {
		String str = "Programing";
		
		
		for(int i =0; i < str.length();i++) {
			char ch = str.charAt(i);
			
			boolean alredyChecked = false;
			
			for(int j =0; j < str.length();j++) {
				if(alredyChecked) {
					break;
				}
			}
			
			if(!alredyChecked) {
				int count =0; 
				
				for(int j =0; j < str.length();j++) {
					if(str.charAt(j) == ch) {
						count++;
					}
				}
				
				System.out.println("Char : "+str.charAt(i) + " "+count);
			}
			
		}
	}

}
