package com.strings;

public class Program1 {
	public static void main(String[] args) {
		  String str  = "sgsg gsgs sgs";
		  int count =0;
		  for(int i =0; i < str.length();i++) {
			  char ch = str.charAt(i);
			  
			  if(ch ==' ') {
				  
			str= 	str.replaceAll("\\s" , "");
			  }
			  
		  }
		  System.out.println(str);
//		  System.out.println("Space count : "+count);
	}

}
