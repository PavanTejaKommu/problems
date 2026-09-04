package com.demo;

public class Main {

	public static void main(String[] args) {


		System.out.println("Positive or negative or zero ");
		System.out.println("----------------------------------------");
		int n =10;
		System.out.println("Given value =  "+n);
		if(n ==0) {
			System.out.println(" 0 ");
		}else if(n < 0) {
			System.out.println("Negative ");
		}else if(n > 0){
			System.out.println("Positive ");
		}



		System.out.println("2. even or odd ");

		int num = 20;

		if(num %2==0) {
			System.out.println("Even ");
		}else {
			System.out.println("Odd");
		}



		System.out.println("-----------------------------------------------------------");
		System.out.println("Greater of two ");

		int num1 = 34;
		int num2 = 21;

		if(num1 > num2) {
			System.out.println("Num 1 is greater than num 2");
		}else {
			System.out.println("num2 is greater than num1");
		}




		System.out.println("-------------------------------------------------------------");
		System.out.println("Voter eligibility ");


		int age = 23; 
		if(age >=18 ) {
			System.out.println("Eligible to vote ");
		}else {
			System.out.println("NOt eligible");
		}



		System.out.println("-----------------------------------------------------------");
		System.out.println("Leaf year ");
		int year = 2004;

		if(year %4 ==0) {
			System.out.println("Leaf Year");
		}else {
			System.out.println("Not an leaf year");
		}



		System.out.println("-------------------------------------------------");
		System.out.println("Divisible by 5");


		int div = 50;
		if(div %5 == 0) {
			System.out.println("Yes ");
		}else {
			System.out.println("Not divisible by 5");
		}


		System.out.println("----------------------------------------------------");

		System.out.println("Vowels");
		char ch = 'b';


		if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("vowel");
		}else {
			System.out.println("Not vowel");
		}



		System.out.println("--------------------------------------------------------");
		System.out.println("");


		int a = 10 ; 
		int b = 20;
		int c = 30;

		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("C : "+c);

		if(a > b && a > c) {
			System.out.println("A is gretaer ");
		}else if(b > a && b > c) {
			System.out.println("B is greater");

		}else {
			System.out.println("C is greater");
		}



		System.out.println("------------------------------------------------------");
		System.out.println("Smallest in three ");

		int d=20;
		int e = 30;
		int f=40;

		if(d < e  && d < f) {
			System.out.println("D is smallest ");
		}else if(e < d && e < f) {
			System.out.println(" E is smallest");
		}else {
			System.out.println("F is smaller");
		}


		System.out.println("-------------------------------------------------------------");
		System.out.println("Divisible by 5 and 3 ");


		int g = 20;

		if(g % 5 == 0) {
			if(g % 3 ==0) {
				System.out.println("The number is divisible by 5 and 3");
			}
		}else {
			System.out.println("Not divisible ");
		}


		System.out.println("---------------------------------------------------------------");
		System.out.println("triangle ");


		int side1 = 21;
		int side2 = 25;
		int side3 = 23;


		if(side1 == side2 && side1==side3) {
			System.out.println("Equalateral triangle");
		}else if(side1 == side2 || side1 == side3) {
			System.out.println("Isosolios triangle ");
		}else {
			System.out.println("Scallen triangle ");
		}




		System.out.println("----------------------------------------------------");
		int day = 7;


		switch (day) {

		case 1: {

			System.out.println("Sun");
			break;
		}
		case 2: {
			System.out.println("Mon");

			break;
		}
		case 3: {
			System.out.println("Tue");

			break;
		}case 4: {
			System.out.println("Wed");

			break;
		}case 5: {
			System.out.println("Thu");

			break;
		}case 6: {
			System.out.println("Fri");

			break;
		}case 7: {
			System.out.println("Sat");

			break;
		}
		default:
			System.err.println("Invalid input ");
		}


		System.out.println("---------------------------------------------------------------");


		System.out.println("Month using switch ");
		System.out.println();
		int month = 2;

		switch (month) {
		case 1: {
			System.out.println("        January         ");

			break;
		}

		case 2: {

			System.out.println("        Feb         ");

			break;
		}
		case 3: {
			System.out.println("        March         ");

			break;
		}case 4: {

			System.out.println("        April         ");

			break;
		}case 5: {
			System.out.println("        May         ");

			break;
		}case 6: {

			System.out.println("        June         ");

			break;
		}case 7: {
			System.out.println("        July         ");

			break;
		}case 8: {
			System.out.println("        August         ");


			break;
		}case 9: {
			System.out.println("        September         ");


			break;
		}
		case 10: {

			System.out.println("        Octbober         ");


			break;
		}
		case 11: {
			System.out.println("        November         ");


			break;
		}case 12: {

			System.out.println("        December         ");


			break;
		}

		default:
			System.err.println("Invalid input ");
		}





































	}


}
