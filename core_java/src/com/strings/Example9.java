package com.strings;

public class Example9 {
	private	String str1;
	private	String str2;

	




	public Example9(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}
	public void isAnagram() {
		int count =0;
		if(str1.length() == str2.length()) {
			for(int i =0; i < str1.length();i++) {
				char ch = str1.charAt(i);
				for(int j =0;j < str1.length();j++) {

					if(ch == str2.charAt(j)) {
						count++;
					}
				}
			}

		}
		if(count == str1.length() && count == str2.length()) {
			System.out.println("Is Anagram ");
		}else {
			System.out.println("Is not an Anagram");
		}


	}
	public static void main(String[] args) {
		//Anagram


		String str1 = "heart";
		String str2 = "earth";

		Example9 example9 = new Example9(str1, str2);
		example9.isAnagram();

	}

}
