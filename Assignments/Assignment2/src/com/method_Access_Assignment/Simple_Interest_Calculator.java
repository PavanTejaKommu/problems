package com.method_Access_Assignment;

import java.util.Scanner;

public class Simple_Interest_Calculator {


	int  Principal;
	int 	Rate;
	int 	Time;

	float simplenIntrest ;

	public void calculateSI() {

		System.out.println("Principal :"+Principal);
		System.out.println("Rate :"+Rate);
		System.out.println("Time :"+Time);

		simplenIntrest = (Principal*Time*Rate)/100;
		System.out.println("Simple Intrest " +simplenIntrest);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		Simple_Interest_Calculator  st = new Simple_Interest_Calculator();

		System.out.println(" Pricipal");
		st.Principal = sc.nextInt();

		System.out.println(" Rate");
		st.Rate = sc.nextInt();


		System.out.println(" Time");
		st.Time = sc.nextInt();

		st.calculateSI();



	}

}
