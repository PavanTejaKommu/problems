package com.strings;

import java.util.HashSet;
import java.util.Iterator;

public class Example26 {
	 private String str ;
	public Example26(String str) {
		super();
		this.str = str;
	}
	
	void isLongestSubString() {
		StringBuffer sb = new StringBuffer();
		HashSet<Character> hs = new HashSet<>();
		for(int i =0; i <str.length();i++) {
			
			hs.add(str.charAt(i));
			
		}
		
		for(char c : hs) {
			sb.append(c);
		}
		
		System.out.println(sb);
		
		
		
	}
	public static void main(String[] args) {
		
		String str = "abcabcbb";
		Example26 exam = new Example26(str);
		exam.isLongestSubString();
		
		
	}

}
