package com.operators;

public class Task1 {

	public void cal(float num1 , float num2 ) {
		System.out.println("Addition       :"+num1+num2);
		System.out.println("Substraction   :"+(num1-num2));
		System.out.println("Multiplication :"+num1*num2);
		System.out.println("Division       :"+num1/num2);
		System.out.println("Modulus        :"+num1%num2);


	}
	public static void main(String[] args) {

		Task1 t1 = new Task1();
		t1.cal(10, 20);


	}

}
