package com.problemsolving;

public class Program3 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("add : "+(a+b));
		System.out.println("sub : "+(a-b));
		System.out.println("mul : "+(a*b));
		System.out.println("Div : "+(a/b));
		System.out.println("Mod : "+(a%b));


		System.out.println("Assignment operators ");
		System.out.println("= : "+(a=b));
		System.out.println("+="+(a+=b));
		System.out.println("-="+(a-=b));
		System.out.println("*="+(a*=b));
		System.out.println("/="+(a/=b));
		System.out.println("%="+(a%=b));




		System.out.println(79 & 39);
		System.out.println(56 | 23);

		//128 64 32 16 	8 4 2 1
		//	0   1  0  0     1 1 1  1    = 79
		//  0   0  1   0     0 1 0 1     = 39
		//  0   0  0  0      0  1 0 1     = 7

System.out.println(4 * 78);

System.out.println("Ternary operators ");
int c = 10; 
int d = 20;

int max = (c> d) ? c : d;
System.out.println(max);

String s = "java";
System.out.println(s instanceof String);

Integer num = 20;

System.out.println(num instanceof Object);
System.out.println(num instanceof Number);
System.out.println(num instanceof  Integer);



		/*
		 * 28/10/2026
		 * Space Complexity 
		 * arr = {1, 2, 3};
		 * int a = 12;
		 * 
		 * reverse 
		 * int - data type 
		 * a, 10 -> operands 
		 * = -> operator 
		 * a=20;
		 * Data types :
		 * Primitive  - byte , short , int , long , double flot , char , boolean
		 * implicit type casting -> small data type to large datatype 
		 * ling b = 20;
		 * 
		 * Explicit -> int c = (int) b
		 * 
		 *  Non primitive 
		 * Arrays , strings , collections , class
		 * operators ====>
		 * Arthematic -> (+ , - , * , / )
		 * Assignment operators -> = , += , -= , /= , %=, *=;
		 * relational (== , >= , < <=, !=) -> 
		 * logical operators (&& ||, !)
		 * bitwise ( &  , |, ^ , << , >> , >>>)
		 * logical statements : 
		 * if , if-else , nextedif
		 * 
		 * looping statement:
		 * for , while , do while ,: 
		 * switch , 
		 *  
		 */
	}
}
