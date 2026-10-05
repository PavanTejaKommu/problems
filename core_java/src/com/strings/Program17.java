package com.strings;

public class Program17 {
	
	public void isWordLength(String str) {
		String arr[] = str.trim().split("\\s+");
		
		for(int i =0; i < arr.length;i++) {
			
			System.out.println("Word : "+arr[i] + " => length : "+arr[i].length());
		}
	}
	
	
	public static void main(String[] args) {
		Program17 pg = new Program17();
		String str =  "java is easy java is powerful";
		pg.isWordLength(str);
	}

}
