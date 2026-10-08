package com.strings;

import com.multithreading.Example;

public class Example20 {

	private String str;

	public Example20(String str) {
		super();
		this.str = str;
	}

	boolean isPalindrome() {
		int left =0;
		int right = str.length()-1;
		while(left < right) {

			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}
		return true;
	}

	public static void main(String[] args) {
		String str = "madam";
		Example20 exa = new Example20(str);
		System.out.println(exa.isPalindrome());
	}

}
