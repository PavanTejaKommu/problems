package com.strings;

import java.util.Arrays;

public class Example10 {
	private String str1;
	private String str2;
	
	
	
	
	public Example10(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}

	



	public String getStr1() {
		return str1;
	}





	public void setStr1(String str1) {
		this.str1 = str1;
	}





	public String getStr2() {
		return str2;
	}





	public void setStr2(String str2) {
		this.str2 = str2;
	}

	
	public void isAnagram2() {
		
		char ch[] = getStr1().toCharArray();
		Arrays.sort(ch);
		
		String sortedString1 = new String(ch);
		
		
		char ch2[] = getStr2().toCharArray();
		
		Arrays.sort(ch2);
		String sortedString2 = new String(ch2);
		
		if(sortedString1.equals(sortedString2)) {
			System.out.println("Is Anagram");
		}else {
			System.out.println("Is not an Anagram");
		}
		
	}



	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "silent";
		Example10 example = new Example10(str1, str2);
		example.isAnagram2();
		
	}

}
