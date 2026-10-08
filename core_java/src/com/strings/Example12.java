package com.strings;

public class Example12 {
	 private String str1;
	 private String str2;
	 
	public Example12(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}
	
	
	
	public void isRotation() {
		
		if(str1.length() == str2.length()) {
			
			str1.contains(str2);
			System.out.println("Rotation");
			
		}else {
			System.out.println("Not an Rotation ");
		}
		
	}
	public static void main(String[] args) {
		
	String str=	"abcd";
	 String str2=	"cdab";

	 Example12 example = new Example12(str, str2);
	 
		example.isRotation();
	}

}
