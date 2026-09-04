package com.problem.solving;

public class Factors {
	
public void getFactors(int num) {
	
	System.out.println("Factors : ");
	for(int  i =1 ; i<= num ;i++) {
		if(num % i ==0) {
			System.out.println(i);
		}
	}
}

}
