package com.task.four;

import java.util.Scanner;

public class CheckPrimeNumber {
	public void checkprime(int num) {
		int count=0;
		for(int i =1; i<= num;i++) {
				if(num%i ==0) {
					count++;
				}
			
		}
		
		if(count <3) {
			System.out.println("Given Number is prime : "+num);
			
		}else {
			System.out.println("Given Number is not a Prime : "+num);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		CheckPrimeNumber cp = new CheckPrimeNumber();
		System.out.println("Enter the number : ");
		cp.checkprime(sc.nextInt());
		sc.nextLine();
		sc.close();
		
	}

}
