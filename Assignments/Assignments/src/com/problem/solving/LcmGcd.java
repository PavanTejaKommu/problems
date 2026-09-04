package com.problem.solving;

public class LcmGcd {
	
	
	public void getGcd(int num , int num2) {
		
		while(num != num2) {
			if(num > num2) {
				num = num - num2;
			}
			if(num2 > num) {
				num2 = num2 - num; 
			}
		}
		System.out.println("GCD : "+num);
	}
	
	
	public void getLcm(int num , int num2) {
		for(int i= 2 ; i<=num && i<= num2;i++) {
			if(num%1 ==0 && num2 % i ==0) {
				System.out.println("LCM : "+i);
				break;
			}
		}
		
		
	}
	

}
