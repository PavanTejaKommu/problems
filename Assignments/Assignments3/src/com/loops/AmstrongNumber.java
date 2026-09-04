package com.loops;

import java.util.Scanner;

public class AmstrongNumber {
	int count =0;
	int sum =0;

	public int power( int num) {
int sum =0;
int power = 1;
		for(int i =1;i<=count;i++) {
			power  = power * num;
		}
		sum = sum+ power;
		return sum;

	}
	public int count(int num ) {

		while(num> 0) {

			count++;

			num= num/10;
		}
		return count;
	}

	public boolean isAmstrong(int num) {
		count(num);
		power(count);
		int temp = num;

		while(num > 0){
			int digit = num %10;
			sum +=power(digit);
			num = num/10;
		}
		System.out.println("Count : "+count);


		System.out.println(" Sum : "+sum);
		return  sum == temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AmstrongNumber ag = new AmstrongNumber();
		System.out.println("Enter the number : ");
		System.out.println(ag.isAmstrong(sc.nextInt())
				? "Is amstrong " : "Is not an amstrong");
	}

}
