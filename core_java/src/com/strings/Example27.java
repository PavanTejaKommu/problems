package com.strings;

public class Example27 {
	String str;

	public Example27(String str) {
		super();
		this.str = str;
	}
	void isLongest() {
		String longest="";

		for(int i =0; i < str.length();i++) {
			String sub = "";

			for(int j = i ; j < str.length();j++) {
				char ch = str.charAt(j);
				if(sub.indexOf(ch) != -1) {
					break;
				}

				sub = sub + ch;

				if(sub.length() > longest.length()) {
					longest = sub;
				}
			}



		}
		System.out.println("Longest Sub String : "+longest);
		System.out.println("Longest Sub String Length : "+longest.length());
		System.out.println(str.indexOf(2));
	}

	public static void main(String[] args) {
		String str = "abcabcbb";
		String str2 = "pwwkew";
		String str3 = "tmmzuxt";
		Example27 exam = new Example27(str3);
		exam.isLongest();

	}

}
