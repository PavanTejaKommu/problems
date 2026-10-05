package com.strings;

public class Program10 {
	public static void main(String[] args) {
		String str = "programming";
		String str2 = "";
		
		int min = 1;
		for(int i  =0; i < str.length();i++) {
			int count =0;
			char ch = str.charAt(i);
			
			for(int j = i +1 ; j< str.length();j++) {
				if(ch == str.charAt(j)) {
					count++;
					
				}
			}
			
			if(min  > count) {
				min=count;
				str2 = str2 + str.charAt(i);
			}
			
		}
		
		System.out.println(str2);
		
		
		
		
		
	}

}
