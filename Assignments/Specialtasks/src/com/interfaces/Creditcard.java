package com.interfaces;

public class Creditcard  implements Payment{

	@Override
	public void pay(int amount) {
		
		System.out.println("Actual Amount : "+(amount -(amount * 0.02)) );
		
	} 
	
	
	
	public static void main(String[] args) {
		
		Payment p = new Creditcard();
		p.pay(5000);
		
	}

}
