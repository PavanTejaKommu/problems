package com.strings;

public class Example18 {
	private String str;
	public Example18(String str) {
		super();
		this.str = str;
	}
	
	StringBuffer isValid() {
		StringBuffer sb = new StringBuffer();
		
		for(int i =0; i < str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch =='u') {
				sb.append(str.charAt(i));
			}
		}
		
		return sb;
	}
	public static void main(String[] args) {
		String str = "aeioupavanteja41256aeious";
		
		Example18 exam = new Example18(str);
		
		System.out.println(exam.isValid());
		
	}

}
