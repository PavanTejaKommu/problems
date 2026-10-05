package com.strings;

public class Program8 {
	public static void main(String[] args) {
		String str = "programming";
		String str2 = "";
		
		for(int i =0; i < str.length();i++) {
			
			boolean flag = false;
			
			for(int j =i+1;j < str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					flag=true;
				}
			}
			if(!flag) {
				str2 = str2 + str.charAt(i);
			}
		}
		
		System.out.println(str2);
	}

}
