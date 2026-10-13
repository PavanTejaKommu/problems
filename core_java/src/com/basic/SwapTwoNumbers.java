package com.basic;
class X {
	
	public void method() {
		System.out.println("Method");
	}
}



public class SwapTwoNumbers {
	
	public void sum() {
		System.out.println("Sum");
	}
	public static void main(String[] args) {
		Integer a = 20;
		Integer b = 30;
		
		/*temp = a;
		a=b;
		b= temp;
		*/
		
		a = (a * b)/a;
		
		b = (a*b) /b;
		System.out.println(a + " - " + b);
		
	}

}
