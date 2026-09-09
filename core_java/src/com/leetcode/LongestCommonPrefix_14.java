package com.leetcode;

public class LongestCommonPrefix_14 {


	public String  check( String [] strs) {

		String prefix = strs[0];

		for(int i =1; i < strs.length;i++) {

			while(!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1); 

				if(prefix.length()==0) {
					return null;
				}
			}
		}


		return prefix;
	}

	public static void main(String[] args) {


		String str [] = {"flow", "flower", "flight"};


		LongestCommonPrefix_14 lg = new LongestCommonPrefix_14();
		System.out.println(lg.check(str));

	} 

}
