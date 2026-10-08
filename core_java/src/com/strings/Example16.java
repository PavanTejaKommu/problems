package com.strings;

public class Example16 {
	 private String str ;
	public Example16(String str) {
		super();
		this.str = str;
	}
	StringBuffer isRemoveSpecial() {
		boolean isSpecial= true;
		StringBuffer sb = new StringBuffer();
		
		for(int i =0; i < str.length();i++) {
			if(Character.isLetterOrDigit(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
			
		}
		
		return sb;
	}
	public static void main(String[] args) {
		
		String str = "pavan%$#teja15$412";
		Example16 example = new  Example16(str);
		
		System.out.println(example.isRemoveSpecial());
	}

}
