package com.arrays;

import java.util.Scanner;

public class CheckNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {1, 2 , 3, 45, 32, 23, 78, 98 , 60 , 43,21};
		
		System.out.println("Enter Number to search : ");
		int num = 23 ;
		for(int i =0;i < arr.length;i++) {
			if(arr[i] == num) {
				System.out.println("conatians : "+num);
			}
		}
	}

}
