package com.saticandInstanceMethods;

public class Mobile {
	public static String brand = "VIVO";
	public String model = "V20";
	public int price = 35000;

	public static void brandInfo() {
		System.out.println("Brand :"+brand);

	}

	public  void mobileInfo() {
		System.out.println("Model :"+model);
		System.out.println("Price :"+price);

	}
	public static void main(String[] args) {

		Mobile mb = new Mobile();
		mb.brandInfo();
		mb.mobileInfo();


	}

}
