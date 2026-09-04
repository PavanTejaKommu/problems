package com.loops;

import java.util.Scanner;

public class DuckNumber {

	public boolean isDuckNumber(int num) {
		int temp =num;
		if(num > 0) {
			while(num > 0) {
				int remin = num % 10;
				if(remin == 0) {
					return true;
				}
				num/=10;
				
			}
		}else {
			System.err.println("Please enter the value above 0");
		}
		
		return false;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DuckNumber dn = new DuckNumber();
		System.out.println("Enter the number ");
		System.out.println(dn.isDuckNumber(sc.nextInt())
		?"It is a  duck Number" : "Is not duck");
		
	}

}
