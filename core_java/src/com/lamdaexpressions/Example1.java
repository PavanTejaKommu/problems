package com.lamdaexpressions;


interface NumberChecker{
	boolean checkNumber( int num);
	
}



interface CharChecker{
	boolean checkChar(char ch);
}

public class Example1 {
	
	public static boolean isPrime(int num) {
		for(int i =2 ; i * i < num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		NumberChecker numch = new NumberChecker() {
			
			@Override
			public boolean checkNumber(int num) {
				if(isPrime(num)) {
					return true;
				}
				return false;
			}
		};
		System.out.println(numch.checkNumber(45)?"Prime":"Not an Prime");
		CharChecker charch = ( char ch) -> {
			return isPrime(ch);
		};
			 
			 System.out.println(charch.checkChar('A')?"Prime " : "Not Prime");
		 
	}

}
