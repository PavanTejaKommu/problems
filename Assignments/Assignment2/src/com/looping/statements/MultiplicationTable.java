package com.looping.statements;

import java.util.Scanner;

public class MultiplicationTable {

	public void table(int num) {
		int i=1;
		while(i<=10) {
			System.out.println(num+" X "+i+" = "+(num*i));
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MultiplicationTable mt = new MultiplicationTable();
		System.out.println("Enter the number");
		mt.table(sc.nextInt());

	}

}
