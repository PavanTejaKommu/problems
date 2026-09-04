package com.keyword;

import java.util.Scanner;

public class Mobile {


	private String	brand;
	private String	model;
	private int	price;


	public void setMobileDetails(String brand , String model, int price) {

		this.brand = brand;
		this.model = model;
		this.price = price;
		System.out.println("Details added succefully ");
	}

	public void displayDetails() {
		System.out.println("Mobile Brand : "+brand);
		System.out.println("Mobile model : "+model);
		System.out.println("Mobile price : "+price);
	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the mobile brand : ");
		String brand = sc.nextLine();
		
		System.out.println("Enter the mobile model : ");
		String model = sc.nextLine();
		
		System.out.println("Enter the mobile price : ");

		int price = sc.nextInt();
		Mobile mb = new Mobile();
		
		mb.setMobileDetails(brand, model, price);
		mb.displayDetails();
	}

}
