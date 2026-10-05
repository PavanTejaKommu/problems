package com.strings;

import java.util.Arrays;

public class Program13 {
	
	public void isReverse(String str) {
		String arr[]  = str.trim().split("\\s+");
		for(int i =0 ; i < arr.length;i++) {
			String str2 = "";
			for(int j =arr[i].length()-1; j >=0;j--) {
				str2 = str2 + arr[i].charAt(j);
				
			}
			
			
			arr[i] = arr[i].replace(arr[i], str2);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		Program13 pg = new Program13();
		String str =  "Java is easy";
		
		pg.isReverse(str);
		
	}

}
