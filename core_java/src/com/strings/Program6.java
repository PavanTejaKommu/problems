package com.strings;

public class Program6 {
	public static void main(String[] args) {
		String str = "programing";
		
		for(int i =0; i < str.length();i++) {
			boolean flag = true;
			for(int j =i=1; j < str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					System.out.println(str.charAt(i));
					flag = false;
					break;
				}
				
			}
			if(!flag)
				break;
			
		}
	}

}
