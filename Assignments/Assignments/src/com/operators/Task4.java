package com.operators;

public class Task4 {

	public static void cal(int  num) {


		num+=num;
		System.out.println("Operation += :"+num);

	}

	public static void minusEquals(int num) {
		num-=num;
		System.out.println("Operation -= :"+num);
	}


	public static void Multiplication(int num) {
		num*=num;
		System.out.println("Operation *= :"+num);
	}

	public static void division(float num) {
		num/=num;
		System.out.println("Operation /= :"+num);
	}
	public static void main(String[] args) {


		cal(100);
		minusEquals(100);
		Multiplication(100);
		division(100);

	}

}
