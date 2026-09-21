package com.strings;

public class Example5 {
	
	public static void main(String[] args) {
		String str = "madam";
		String reversed = "";
		
		
		for(int i =str.length()-1; i >=0;i--) {
			reversed   += str.charAt(i);
//			System.out.println(reversed);
		}
		
		if(str.equals(reversed)) {
			System.out.println("It is an palindrome ");
		}else {
			System.out.println("Not an palindrome ");
		}
		
	}

}
