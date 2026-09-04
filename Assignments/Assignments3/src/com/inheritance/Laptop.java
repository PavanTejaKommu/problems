package com.inheritance;

public class Laptop  extends Computer{
	public void model() {
		System.out.println("Model : Pavilion XP5 15");
		
	}

	public static void main(String[] args) {

		
		Laptop lp = new Laptop();
		lp.showBrand();
		lp.model();
		
	}

}
