package com.strings;

public class Example13 {

	private String string ;
	public Example13(String string) {
		this.string = string;
	}


	boolean isOnlyContainsNumbers() {
		
		boolean isNumber = true;

		for(int i =0; i < string.length();i++) {

			if(!Character.isDigit(string.charAt(i))) {
				isNumber=false;
				break;
			}
		}
		return isNumber;
	}



	public static void main(String[] args) {

		String str = "1323246434646";
		Example13 example = new Example13(str);
		System.out.println(example.isOnlyContainsNumbers());		


	}
}
