package com.strings;

public class Program23 {
	public static void main(String[] args) {
		String str = "ADOBECODEBANC";
		String check =  "ABC";
		String smallestString = str;
		//boolean flag = true;
		
		for(int i =0; i < str.length();i++) {
			
			for(int j = i+1; j < str.length();j++) {
				
				String temp = "";
				
				for(int k =i; k <= j;k++) {
					temp = temp + str.charAt(k);
				}
				
				boolean flag = true;
				for(int m = 0 ; m < check.length();m++) {
					char ch = check.charAt(m);
					if(!temp.contains(String.valueOf(ch))) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					if(temp.length() < smallestString.length()) {
						smallestString = temp;
						

					}
				}
				
				
			}
		}
		System.out.println(smallestString);
		
	}

}
