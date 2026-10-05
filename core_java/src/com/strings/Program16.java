package com.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program16 {
	public void isShort(String str) {
		
		String arr[] = str.trim().split("\\s+");
		String shortestWord = arr[0];
		
		for(int i =0; i < arr.length;i++) {
			
			if( shortestWord.length() > arr[i].length()) {
			shortestWord = 	arr[i];
				
			}
			
		}
	
		System.out.println(shortestWord);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		
		String str =  "java is easy java is powerful";
		Program16 pg = new Program16();
		
		
		pg.isShort(str);
	}

}
