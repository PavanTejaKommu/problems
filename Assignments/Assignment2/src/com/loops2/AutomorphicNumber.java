package com.loops2;
import java.util.*;
public class AutomorphicNumber {
	
	public int count(int number) {
		int count =0;
		while(number > 0) {
				count++;
			
			number = number/10;
		}
		return count;
	}
	
	public int square(int digit) {
		int square = digit * digit;
		return square;
	}
	
	
	public boolean isAutomorphicNumber(int num) {
		
		int temp = num;
		int square = square(num);
		int count = count(num);
		int sum = 0;
			
		int power =(int) Math.pow(10, count);
		
			if(square% power == temp  ) {
				return true;
			}
			
		
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AutomorphicNumber ac = new AutomorphicNumber();
		System.out.println(ac.isAutomorphicNumber(sc.nextInt())
				? "It is automorohic number" : "It is not an ");

	}

}
