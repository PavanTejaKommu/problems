package com.strings;

public class Program20 {
	public void isNonRepeated(String str) {
		String arr[] = str.trim().split("\\s+");
		String strNon = "";
		for(int i =0; i < arr.length;i++) {
			
			for(int j= i+1;j< arr.length;j++) {
				
				if(!arr[i].equals(arr[j])) {
					
					strNon = arr[i];
					
				}
			}
		}
		System.out.println(strNon);
		
		
	}
	public static void main(String[] args) {
		Program20 pg = new Program20();
		String str = "java java is awesome is ";
		
		pg.isNonRepeated(str);
	}

}
