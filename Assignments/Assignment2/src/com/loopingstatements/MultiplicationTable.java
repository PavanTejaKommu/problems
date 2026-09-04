package com.loopingstatements;
import java.util.*;
public class MultiplicationTable {

	public void gettingMultiplication(int num) {

		for(int i =1;i<=10;i++) {
			System.out.println(+num+" X "+i+" = "+num*i);
		}

	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		MultiplicationTable obj = new MultiplicationTable();
		System.out.println("Enter the Number");
		obj.gettingMultiplication(sc.nextInt());

	}

}
