package com.problemsolving;

public class Sample2 {

	public static void main(String[] args) {
		// find the root digit of a number
		// check the number is magic number or not
		int num = 3;
		
		int sum =1;
		
		for(int i =1;i<=3;i++) {
			
			sum=sum*num;
			
		}
		
		System.out.println(sum);
	}

}
