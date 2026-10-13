package com.strings;

public class Program22 {
	public static void main(String[] args) {
		String str1 = "paper";
		String str2 = "title";
		
		
		if(str1.length() == str2.length()) {
			boolean flag = true;
			for(int i =0; i < str1.length();i++) {
				for(int j =0 ; j < str1.length();j++) {
					
					if(str1.charAt(i) == str1.charAt(j) && str2.charAt(i) != str2.charAt(j)) {
						flag = false;
						break;
					}
					if(str1.charAt(i) != str1.charAt(j) && str2.charAt(i) == str2.charAt(j)) {
						flag = false;
						break;
					}
					
					
				}
				if(!flag) {
					break;
				}
			}
			
			if(flag) {
				System.out.println("It is an Isomarphic");
			}else {
				System.out.println("Not");
			}
			
		}
		else {
			System.out.println("Not possible ");
		}
		
		
	}

}
