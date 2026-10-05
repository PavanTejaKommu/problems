package com.strings;

public class Program11 {
	
	public static void main(String[] args) {
		
		String str = "hello";
		boolean isUnique=true;
		for(int i =0; i < str.length();i++) {
			
			for(int j =i +1 ; j< str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					isUnique= false;
				}
			}
		}
		System.out.println(isUnique);
		
	}

}
