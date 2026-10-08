package com.strings;

public class Example14 {
	String str ;

	public Example14(String str) {
		super();
		this.str = str;
	}
	public boolean isOnlyCharacters() {
		boolean isChar= true;
		for(int i= 0 ; i < str.length();i++) {

			if(Character.isDigit(str.charAt(i))) {
				isChar = false;
				break;

			}

		}
		return isChar;
	}

	public static void main(String[] args) {

		String str = "dfhdhmhvf";

		Example14 example = new Example14(str);
		System.out.println(example.isOnlyCharacters());		
	}

}
