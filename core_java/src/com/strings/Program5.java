package com.strings;

public class Program5 {

	public static void main(String[] args) {
		
		String str = "swiss";

		int index= 0;
		for (int i = 0; i < str.length(); i++) {
			int count =0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					index = i;
				}
			}
			System.out.println("Count : "+count);
			System.out.println("Index value : "+index);

			if(count == 1) {
				System.out.println("Non Repeated Character : "+str.charAt(i));
				break;
			}
			
		}
	}
}
