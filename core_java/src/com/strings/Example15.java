package com.strings;

public class Example15 {
	private String str;
	
	public Example15(String str) {
		super();
		this.str = str;
	}

	boolean isOnlyAlphaNumaric() {
		boolean isAlphaNumaric = true;
		
		for(int i =0; i < str.length();i++) {
			
			if(!Character.isLetterOrDigit(str.charAt(i))) {
				isAlphaNumaric = false;
				break;
		
			}
		}
		
		return isAlphaNumaric;
	}
	public static void main(String[] args) {
		String str = "dfbdhd5646767";
		
		Example15 example = new Example15(str);
		
		System.out.println(example.isOnlyAlphaNumaric());
		
	}

}
