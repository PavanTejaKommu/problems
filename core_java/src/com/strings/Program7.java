package com.strings;

public class Program7 {
	public static void main(String[] args) {
		String str = "programming";
		
		
		for(int i =0;  i < str.length();i++){
			boolean flag = false;
			
			for(int j = i+1; j < str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					flag= true;
				}
			}
			
			if(flag) {
				System.out.println(str.charAt(i));
			}
			
		}
		
	}

}
