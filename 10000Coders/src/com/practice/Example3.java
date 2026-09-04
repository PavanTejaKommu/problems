package com.practice;

import java.util.Scanner;

public class  Example3 {
	int num;

	public Example3(int num) {
		this.num = num;
	}
	
	public Example3(int num, int num2) {
		this.num = num2;
		this.num = num;
		
		System.out.println("Values : "+num+" "+num2);
	}

	public void iseven() {
		System.out.println("The given number is even : "+num);
	}

	public void isodd() {
		System.out.println("The given number is odd : "+num);
	}
	public void checking() {


		if(this.num %2 ==0) {
			iseven() ;
		}else {
			isodd() ;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numner");
		Example3 ep = new Example3(sc.nextInt());

		ep.checking();
		System.out.println("Second values ");
		Example3 ep2 = new Example3(sc.nextInt(), sc.nextInt());



	}

}
