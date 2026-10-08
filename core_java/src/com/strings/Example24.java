package com.strings;

public class Example24 {
	private String str;
	
	public Example24(String str) {
		super();
		this.str = str;
	}
	
	void isSpaceSetting() {
		StringBuffer sb = new StringBuffer();
		StringBuffer s = new StringBuffer();
		for(int i  =0; i < str.length();i++) {
			if(str.charAt(i) == ' ') {
				sb.append(str.charAt(i));
			}else {
				s.append(str.charAt(i));
			}
		}
		System.out.println(s.append(sb));
	}

	public static void main(String[] args) {
		String str = "   teja pav  an ";
		Example24 exam = new Example24(str);
		exam.isSpaceSetting();
		
	}

}
