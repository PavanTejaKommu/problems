package com.example;

public class NumToDecimal {
	
	public String getNum(int num) {
		String str1 ="";
		String str2 = "";
		while(num > 0) {
			int temp = num % 2;
			str1 += temp;
			num=num/2;
		}
		
		for(int i =str1.length()-1; i>=0;i--) {
			
			str2 += str1.charAt(i);
		}
		
		
		return str2;
	}
public static void main(String[] args) {
	
	NumToDecimal n = new NumToDecimal();
	System.out.println(n.getNum(54));
	
}
}
