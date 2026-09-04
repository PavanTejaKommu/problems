package com.practice;
import java.util.*;
public class Example4 {
	
	
	public boolean isprime(int num) {
		int count =0;
		for(int i =1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		
//		if(count > 2) {
//			System.out.println("It is not prime ");
//		}
		return count==2;
		
		
	}
	

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Example4 ep = new Example4();
		System.out.println("Enterb the number : ");
		System.out.println(ep.isprime(sc.nextInt())? "prime ": "not prime" );
		
		//System.out.println(");
		
		
	}

}
