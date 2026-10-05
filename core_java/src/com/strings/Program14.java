package com.strings;

public class Program14 {
	public void replace(String str) {
		
		String arr [] = str.trim().split("\\s+");
		
		for(int i =arr.length-1; i >=0 ;i--) {	
			System.out.print(arr[i] + " ");
			
		}
		
	}
	public static void main(String[] args) {
		Program14 pg = new Program14();
		String str =  "Java is easy";
		pg.replace(str);
		
	}

}
