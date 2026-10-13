package com.strings;

public class Program24 {
	public static void main(String[] args) {
		String str = "araaci";
		String strLong = "";
		
		for(int i =0; i < str.length();i++) {
			for(int  j = i ; j < str.length();j++) {
				String temp = "";
				for(int k = i ; k <= j ; k++) {
				temp = temp + str.charAt(k);
				
				}
				String s = "";
				
				if(temp.indexOf(i) == -1) {
					s= s + temp.charAt(i);
				}
				
				if(s.length() > strLong.length()) {
					str= s;
				}
			}
			
		}
		
		System.out.println(strLong);
	}

}
