package com.strings;

public class Program21 {
	public static void main(String[] args) {
		String str[] = {"flower", "flow", "flight"};
		String strPrifix="";
		for(int i =0; i < str.length;i++) {
			boolean flag = true;
			for(int j = i ; j< str.length;j++) {
				if(i >= str[j].length() || str[0].charAt(i) != str[j].charAt(i)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				strPrifix = strPrifix + str[0].charAt(i);
			}else {
				break;
			}
			
		}
		System.out.println("Prefix Common : "+strPrifix);
	
	}

}
