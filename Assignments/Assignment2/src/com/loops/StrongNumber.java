package com.loops;
import java.util.Scanner;
public class StrongNumber {

	public boolean isStrongNumber(int num) {
		int temp = num;
		int sum =0;

		while(num> 0) {
			
			int remin = num  % 10;
			int fact =1;

			for(int i =1;i<=remin;i++) {
				
					fact *=i;
			}
			
			sum =sum + fact;
			num = num/10;
		}
		
		return temp == sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StrongNumber sn = new StrongNumber();
		System.out.println("Enter the Number : ");
		System.out.println(sn.isStrongNumber(sc.nextInt())
				?"Is Strong Number" : "Is not an Styrong Number");

	}

}
