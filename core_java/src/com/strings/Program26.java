package com.strings;

import java.util.HashSet;
import java.util.Set;

public class Program26 {
	public static void main(String[] args) {
		//Count substrings having exactly K distinct characters
		String str = "abcabcaac";

		int k = 2;

		int count =0;
		for(int i =0; i < str.length();i++) {
			for(int j =i ; j < str.length();j++) {
				Set<Character> set = new HashSet<>();

				for(int n = i ; n <= j;n++) {
					set.add(str.charAt(n));
				}

				if(set.size() == k) {
					System.out.println("Set : "+set);
					count++;
				}
			}
		}
		System.out.println("Count : "+count);
	}

}
