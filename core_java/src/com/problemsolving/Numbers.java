package com.problemsolving;

public class Numbers {
	public static void main(String[] args) {
		int n =10;
		String s = "";
		for(int i =1; i <= n; i ++) {
			int temp = i;
			if(i == 3 || i == 7 ) {
				continue;
			}
			s = s + temp + " ";
		}
		System.out.println(s);
	}

}
