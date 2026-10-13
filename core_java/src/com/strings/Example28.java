package com.strings;

public class Example28 {
	public static void main(String[] args) {
	//	String str = new String();
	//String	str = "absabdcaac";
		String str = "abcabcbb";
	String longestSubstring = "";
	String longUnique = "";
		for(int i =0; i < str.length();i++) {
			for(int j =i ; j < str.length();j++) {
				String temp ="";
				for(int k =i ; k <= j ;k++) {
					System.out.print(str.charAt(k)+" ");
					temp = temp + str.charAt(k);
					
				}
				
				if(temp.length() > longestSubstring.length()) {
					longestSubstring = temp;
					
					boolean flag = true;
					
					for(int m = 0 ; m< longestSubstring.length();m++) {
						for(int n =m + 1; n < longestSubstring.length();n++) {
							if(longestSubstring.charAt(m) == longestSubstring.charAt(n)) {
								flag = false;
							}
						}
					}
					
					if(flag) {
						longUnique = longestSubstring;
					}
					
				}
				System.out.println();
			}
		}
		
		
		System.out.println("Longest Sub String : "+longestSubstring);
		System.out.println("Longest Sub String Without Repeating : "+longUnique);
	}

}
