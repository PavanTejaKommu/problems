package com.strings;

import java.util.Arrays;

public class Example21 {
	 private String str ;
	 
	public Example21(String str) {
		super();
		this.str = str;
	}
	
	
	void isChanged() {
		StringBuffer sb = new StringBuffer();
		int left =0;
		int right = str.length()-1;
		char arr [] = str.toCharArray();
		while(left<right) {
			if(!Character.isLetter(str.charAt(left))) {
				left++;
			}
			if(!Character.isLetter(str.charAt(right))) {
				right--;
			}
			
			if(Character.isLetter(str.charAt(left)) && Character.isLetter(str.charAt(right)) ) {
				char temp = str.charAt(left);
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
				
			}
		}
		sb.append(arr);
		System.out.println(sb);
	}

	public static void main(String[] args) {
		String str = "a,b$c";
		
		Example21 exam = new Example21(str);
		exam.isChanged();
		
	}

}
