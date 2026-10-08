package com.strings;

import java.util.Arrays;

public class Example8 {

	public void isCapitalize(String str) {

		String arr[] = str.trim().split("\\s+");

		
		for(int i =0; i < arr.length;i++) {

			char ch = arr[i].charAt(0);

			ch = Character.toUpperCase(ch);

			arr[i] = ch + arr[i].substring(1);

		}
		
		System.out.println(str.substring(1));

		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Example8 eg = new Example8();

		String word = "java is easy";

		eg.isCapitalize(word);
	}
}



