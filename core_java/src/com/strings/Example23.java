package com.strings;

public class Example23 {
	private String str;
	
	public Example23(String str) {
		super();
		this.str = str;
	}
	
	void isVwels() {
		StringBuffer sb = new StringBuffer();
		StringBuffer s = new StringBuffer();
		
		for(int i =0; i < str.length();i++) {
			if(str.charAt(i) == 'a') {
				sb.append(str.charAt(i));
				
			}else if(str.charAt(i) == 'e') {
				sb.append(str.charAt(i));
				
			}else if(str.charAt(i) == 'i') {
				sb.append(str.charAt(i));
				
			}else if(str.charAt(i) == 'o') {
				sb.append(str.charAt(i));
				
			}else if(str.charAt(i) == 'u') {
				sb.append(str.charAt(i));
				
			}else {
				s.append(str.charAt(i));
			}
		}
		System.out.println(sb.append(s));
		
	}

	public static void main(String[] args) {
		String str = "pppaeioupppaeiou";
		Example23 exam = new Example23(str);
		exam.isVwels();
		
	}

}
