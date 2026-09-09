package com.functionaIinterface;

interface NumberChecker{
	public boolean checkNumber(int a);

}


interface CharChecker {

	public void checkChar(char c);
}

public class Example4 {
	public static boolean isPrime (int number) {
		boolean flag = false;
		int count =0;
		for(int i =1 ; i <= number;i++) {
			if(number % i ==0) {
				count++;
			}
		}
		if(count <=2) {
			flag = true;
		}


		return flag;

	}

	public static void main(int num) {




	}


	public static void main(String[] args) {
		
		
		
		NumberChecker numberchecker = new NumberChecker() {
			
			@Override
			public boolean checkNumber(int a) {
				
				return isPrime(a);
			}
		};
		
		CharChecker charchecker = new CharChecker() {
			
			@Override
			public void checkChar(char ch) {
			int num = (int) ch;
				isPrime(num);
				System.out.println(isPrime(num));
				
			}
		};
		
		
		System.out.println(numberchecker.checkNumber(23));
		
	charchecker.checkChar('A');

	}

}
