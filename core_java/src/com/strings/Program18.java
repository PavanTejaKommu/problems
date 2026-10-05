package com.strings;

public class Program18 {
	public void isDuplicate(String str) {
		String arr[] = str.trim().split("\\s+");
		
		
		for(int i =0; i < arr.length;i++) {
			
			for(int j = i+1; j < arr.length;j++) {
				
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Program18 pg = new Program18();
		
		String str = "java is easy java is awesome";
		
		pg.isDuplicate(str);
				
	}

}
