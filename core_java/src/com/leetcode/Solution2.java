package com.leetcode;

import java.util.HashMap;

public class Solution2 {

	public int romanToInt(String s) {

		int sum =0;

		HashMap<String , Integer> hm = new HashMap<>();


		hm.put("I",1);
		hm.put("V" , 5);
		hm.put("X" , 10);
		hm.put("L" , 50);
		hm.put("C" , 100);
		hm.put("D" , 500);
		hm.put("M" , 1000);
		


		for(int i =0 ; i < s.length();i++){
			String temp = String.valueOf(s.charAt(i));
			int current = hm.get(temp);
		
			if(i+1 < s.length() && current < hm.get(String.valueOf(s.charAt(i+1)))) {
				sum-=current;
			}else {
				sum+=current;
			}


		}
		return (int)sum;
	}


	public static void main(String[] args) {

		Solution2 s2 = new Solution2();
		String str = "MCMXCIV";
		String str2 = "LVIII";
		System.out.println(s2.romanToInt(str2));

	}

}
