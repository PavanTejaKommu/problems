package com.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Program25 {
	public static void main(String[] args) {

		//Find the longest substring containing at most KK distinct characters
		int kk = 2;
		//String str = "abcabcaac";
		String str = "aabbcc";
	//	String str = "eceba";
		String longestSubString = "";

		for(int i =0; i < str.length();i++) {
			for(int j =i;j< str.length();j++) {
				String temp = "";
				Set<Character> set = new HashSet<>();
				for(int k =i; k <= j;k++) {
					temp = temp + str.charAt(k);
					set.add(str.charAt(k));
				}
				
				
				if(set.size() == kk && longestSubString.length() < temp.length()) {
					longestSubString = temp;
				}

			}
		}

		
		
		
		System.out.println("Longest Substring with only k instinct values : "+longestSubString);

	}

}
