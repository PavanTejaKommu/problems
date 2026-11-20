package com.leetcode;

public class Solution_28 {
	public static void main(String[] args) {

		String haystack = "sadbutsad";
		String needle = "sad";
		boolean flag = true;
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				if(i < temp) {
					temp = i;
				}
				int val = i;
				for (int j = 0; j < needle.length(); j++) {

					if (haystack.charAt(val) != needle.charAt(j)) {
					
						flag = false;
					}
					val++;

				}
				if (flag) {
					//return temp;
					System.out.println("Temp value : "+temp);
				}
			}
		}
//		return temp;

	}

}
