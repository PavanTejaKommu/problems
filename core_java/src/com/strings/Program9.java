package com.strings;import java.util.concurrent.CountDownLatch;

public class Program9 {
	public static void main(String[] args) {
		String str = "programming";
		
		int max =0;
		String str2 = "";
		for(int i  =0; i < str.length();i++) {
			int count =0;
			char ch = str.charAt(i);
			
			for(int j = i +1 ; j< str.length();j++) {
				if(ch == str.charAt(j)) {
					count++;
					
				}
			}
			
			if(max  < count) {
				max=count;
				str2 = str2 + str.charAt(i);
			}
			
		}
		System.out.println(str2 + " Count :  "+max);
		
		
	}

}
