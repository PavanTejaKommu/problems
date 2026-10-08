package com.strings;

public class Example17 {
	
	String str;
	
	public Example17(String str) {
		super();
		this.str = str;
	}
	
	
	StringBuffer isNotAphabets() {
		StringBuffer sb =new StringBuffer();
		for(int i =0; i < str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch !='u') {
				
				sb.append(str.charAt(i));
				
				
			}
			
		}
		
		return sb;
		
	}

	public static void main(String[] args) {
		
		String str = "aeiouPvan40aeiou25aeiou";
		
		Example17 example = new Example17(str);
		
		System.out.println(example.isNotAphabets());
		
	}

}
