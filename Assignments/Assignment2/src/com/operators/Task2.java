package com.operators;

public class Task2 {

	public static void main(String[] args) {


		int number =1;
		System.out.println("Intial value :"+number);
		System.out.println("pre-increment : before :" +number );
		++number;
				System.out.println(" After :"+number);
				
		System.out.println("post-increment :before :" +number);
		number++ ;
		System.out.println(" After :"+number);
		System.out.println("pre-decrement :before :" +number);
		--number;
		System.out.println(" After :"+number);
		System.out.println("Ipost-decrement :before :" +number);
		number--;
		System.out.println(" After :"+number);
	}

}
