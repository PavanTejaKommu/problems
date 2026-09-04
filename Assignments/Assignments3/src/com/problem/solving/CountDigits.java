package com.problem.solving;

public class CountDigits {
	
	int count =0;
	public void getCount(int num) {
		while(num> 0) {
			count++;
			num = num/10;
			
		}
		System.out.println("The num contains " +count+" digits");
	}

}
