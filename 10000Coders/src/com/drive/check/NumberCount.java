package com.drive.check;

public class NumberCount {

	int num=0;
	public int getNumber(String str) {
		for(int i=0;i< str.length();i++) {
			char ch = str.charAt(i);
			if(ch >='0' && ch<='9') {
				 num = num *10 + (ch-'0');
				System.out.println(str.charAt(i));
			}

		}

		return num;
	}


	public static void main(String[] args) {
		NumberCount n = new NumberCount();
		String str = "skjskb57++64wgsgw467634";

		n.getNumber(str);
	}

}
