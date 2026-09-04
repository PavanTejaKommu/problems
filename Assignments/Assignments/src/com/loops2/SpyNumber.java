package com.loops2;

import java.util.Scanner;

public class SpyNumber {

	public int sum(int num){
		int sum =0;
		while(num > 0) {
			int	remin =  num%10;
			sum = sum + remin;
			num/=10;
		}

		return sum;	
	}


	public int product(int num) {

		int product =1;
		while(num > 0) {
			int rev = num %10;
			product = product * rev;
			num/=10;
		}
		return product;

	}

	public boolean isSpyNumber (int num ) {

		int sum = sum(num);
		int product = product(num);
		if(sum == product) {
			return true;
		}

		return false;

	}
	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);

		SpyNumber sp = new SpyNumber();
		System.out.println(sp.isSpyNumber(sc.nextInt())
				?" It is a Spy Number " : "It is not a Spy number");

	}

}
