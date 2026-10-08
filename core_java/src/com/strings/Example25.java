package com.strings;

import java.util.Arrays;

public class Example25 {
	 private String str;
	public Example25(String str) {
		super();
		this.str = str;
	}
	void isReversing() {
		StringBuilder sb = new StringBuilder();
		
		int left = 0;
		int right = str.length()-1;
		char arr [] = str.toCharArray();
 		
		while(left< right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		

		System.out.println(sb.append(arr));
	}
	public static void main(String[] args) {
		String str = "hello";
		Example25 examp = new Example25(str);
		examp.isReversing();
		
	}

}
