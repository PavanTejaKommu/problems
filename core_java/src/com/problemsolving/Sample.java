package com.problemsolving;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=8;
		String s = "";
		for(int i =1 ; i <= n ; i++) {
			System.out.println("Enter num : ");
			int r = sc.nextInt();
			if(r == 500) {
				break;
			}
			s=s+r+" ";
		}
		System.out.println(s);
		sc.close();
	}

}
