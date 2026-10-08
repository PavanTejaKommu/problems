package com.strings;

import java.util.Arrays;

public class Example19 {
	
	String str ;
	
	
	public Example19(String str) {
		super();
		this.str = str;
	}

	
	String isReverse() {
		
		int left = 0;
		int right = str.length()-1;
		
		char [] arr = str.toCharArray();
		
		while(left < right) {
			char temp =arr[left];
			
			arr[left] = arr[right];
			
			arr[right] = temp;
			
			
			left++;
			right--;
			
		}
		
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		String str = "java is awesome";
		Example19 exam = new Example19(str);
		System.out.println(exam.isReverse());
		
	}

}
