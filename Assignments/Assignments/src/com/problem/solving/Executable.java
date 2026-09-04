package com.problem.solving;
import java.util.*;
public class Executable {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		CountDigits  cd = new CountDigits ();
		System.out.println("Enter the number to count no of digits : ");
		cd.getCount(sc.nextInt());
		
		sc.nextLine();
		
		Fibinoci fb = new Fibinoci();
		System.out.println("Enter the number in fibinoci : ");
		fb.getFibinoci(sc.nextInt());
		
		PrimeNumber pn = new PrimeNumber();
		System.out.println("Enter two numbers for prime numbers ");
		pn.getPrime(sc.nextInt(), sc.nextInt());
		
		Factors fc = new Factors();
		System.out.println("Enter the number for factorial ");
		fc.getFactors(sc.nextInt());
		
		
		
		 LcmGcd ld = new  LcmGcd();
		 System.out.println("Enter the numbers for gcd : ");
		 
		 System.out.println();
		 
		 System.out.println("Enter first value : ");
		int a = sc.nextInt();
		
		System.out.println("Enter second value : ");
		int b = sc.nextInt();
		
		
		 ld.getGcd(a, b);
		 
		 ld.getLcm(a, b);

	sc.close();
	}

}
