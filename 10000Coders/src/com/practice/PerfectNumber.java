package com.practice;
import java.util.*;
public class PerfectNumber {
	public boolean isPerfectNumber(int num) {
		int temp = num;
		int sum =0;
		for(int i =1;i<num;i++) {
			if(num%i == 0) {
				sum +=i;	
				}

		}
		System.out.println(sum);

		return temp == sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PerfectNumber pn = new PerfectNumber();
		System.out.println("Enter the Number");
		System.out.println(pn.isPerfectNumber(sc.nextInt())?"is perfect Number " :"Is not perfect Number"); 


	}

}
