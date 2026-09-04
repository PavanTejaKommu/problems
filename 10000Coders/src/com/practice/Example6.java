package com.practice;
import java.util.*;
public class Example6 {

	public boolean isUglyNumber(int num) {
		int temp = num;
		while(temp %2 ==0) {
			temp=temp/2;
		}
		while(temp %3 ==0) {
			temp=temp/3;
		}

		while(temp %5 ==0) {
			temp=temp/5;
		}

		return temp ==1;

	}

	public static void main(String[] args) {

		// write a java program to find the ugly number and harshad num 

		Scanner sc = new Scanner(System.in);

		Example6 ep = new Example6();
		System.out.println("Enter the number : ");
		System.out.println(ep.isUglyNumber(sc.nextInt()) ?"Is ugly Number" : "Is not ugly Number");


	}

}
