package com.strings;

public class Example29 {
	public static void main(String[] args) {
		String str = "babad";
		
		for(int i =0; i < str.length();i++) {
			for(int j = i+1;j < str.length();j++) {
				String temp = "";
				for(int k =i ; k <=j; k++) {
					
					temp = temp + str.charAt(k);
				}
				
				int left =0;
				int right = temp.length()-1;
				boolean flag = true;
				while(left < right) {
					if(temp.charAt(left) != temp.charAt(right)) {
						flag = false;
						break;
					}
					left++;
					right--;
				}
				
				
				if(flag) {
					System.out.println(temp);
				}
			}
		}
		
		
	}

}
