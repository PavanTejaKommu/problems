package com.strings;

public class Program15 {

	public void largestWord(String str) {

		String arr [] = str.trim().split("\\s+");
		String maxWord = "";

		for(int i =0; i < arr.length;i++) {
			int count= arr[i].length();

			if(maxWord.length()-1 < count ) {
				maxWord = arr[i];
			}
		}

		System.out.println(maxWord);

	}

	public static void main(String[] args) {
		Program15 pg = new Program15();
		String str =  "Java programming language";

		pg.largestWord(str);
	}

}
