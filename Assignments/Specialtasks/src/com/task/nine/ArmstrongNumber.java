package com.task.nine;

import java.util.Scanner;

public class ArmstrongNumber {

	
	
	int count=0;
	public int getCount(int num) {
		
		while(num > 0) {
			count++;
			num/=10;
		}
		return count;
	}

	public int  getPower(int num) {
		int power=1;
		for(int i =1;i<=count;i++) {
			power *= num;
		}
		return power;

	}


	public void isAmstronmg(int num) {
		int original = num;
		int sum =0;
		getCount(num);

		while(num > 0) {
			int temp = num%10;
			sum += getPower(temp);
			num=num/10;
		}

		if(original == sum) {
			System.out.println("The Given Number is Amstrong Number ");
		}else {
			System.out.println("The given Number not a Amstrong Number");
		}




	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		sc.nextLine();

		ArmstrongNumber am = new ArmstrongNumber();
		am.isAmstronmg(num);







		sc.close();





	}

}
