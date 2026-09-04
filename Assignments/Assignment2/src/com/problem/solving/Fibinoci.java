package com.problem.solving;

public class Fibinoci {

	public void getFibinoci(int num) {
		int firstNumber =0;
		int secondNumber = 1;
		int fibi =0;

		System.out.println("Febinoci series ");
		for(int i =0 ; i<= num  ;i++) {
			System.out.println(fibi);
			fibi  = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = fibi;

		}
	}

}
