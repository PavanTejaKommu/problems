package com.practice;
import java.util.*;
public class Example5 {

	
	public boolean inNotPrime(int num) {
		for(int i =2;i<num;i++) {
			if(num%i ==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i =2;i<=num/2;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Example5 ep = new Example5();
		System.out.println("Enter the number : ");
		System.out.println(ep.inNotPrime(sc.nextInt())? "prime ": "not prime" );

	}

}
