package com.strings;

public class Program19 {
	public void isFirstRepeated(String str) {
	 String	arr[] = str.trim().split("\\s+");
	 
	 for(int i =0; i < arr.length;i++) {
		 boolean flag = false;
		 for(int j = i+1; j < arr.length;j++) {
			 
			 if(arr[i].equals(arr[j])) {
				 System.out.println(arr[i]);
				 flag = true;
				 break;
			 }
		 }
		 
		 if(flag)
			 break;
	 }
		
	}
	public static void main(String[] args) {
		
		Program19 pg = new Program19();
		
		
		String str = "java is easy java is awesome";
		
		pg.isFirstRepeated(str);
		
	}

}
