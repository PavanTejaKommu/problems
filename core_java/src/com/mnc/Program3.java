package com.mnc;

public class Program3 {
	
	
	public String binary(int num) {
		String str = "";
		while(num!= 0) {
			int temp = num % 2;
			str= temp + str;
			num/=2;
		}
		return str;
	}
	public static void main(String[] args) {
		int num = 35;
		String str = "";
		
		while(num!=0) {
			int temp = num % 8;
			str=temp+str;
			num/=8;
		}
		Program3 p3 = new Program3();
	
		
		System.out.println(str);
		
		System.out.println(p3.binary(5));
	}

}
