package com.mnc;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		// 05/11/2026 ********************

		//root number
		Scanner sc = new Scanner(System.in);
System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int validate =0;

		while(num > 9) {
			int sum=0;
			while(num !=0) {
				int temp = num % 10;
				sum+=temp;
				num/=10;
			}

			num=sum;
			validate = sum;

			if(sum == 1) {
				System.out.println("Magic Number  ");
			}else {
				System.out.println("Not a Magic Number  ");
			}

		}
		//System.out.println(validate);


		
		sc.close();
		

	}
}
