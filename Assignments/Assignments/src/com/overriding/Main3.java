package com.overriding;

import java.util.Scanner;

class FoodDelivery{

	double distance ;
	double discount ;
	double deliveryTime;

	void calculateDeliveryCharge(double distance) {


		double deliveryCharge = distance * 80;
		System.out.println(" Delivery charge : "+deliveryCharge);
		this.distance = distance;


	}
	void  calculateDiscount(double amount) {

		double discount2 = (amount * 2)/100;
		this.discount = discount2;

	}
	void estimateDeliveryTime() {
		double deliveryTime2 = distance / 4;
		this.deliveryTime = deliveryTime2;
		System.out.println("Delivery Time : "+deliveryTime);


	}
	void  displayOrderStatus() {
		System.out.println("Distance : "+distance);
		System.out.println("Discount : "+discount);
		System.out.println("Delivery Time : "+deliveryTime);
		System.out.println("Order is on the way ");


	}


}


class SwiggyDelivery extends FoodDelivery{


	void calculateDeliveryCharge(double distance) {




		double deliveryCharge = distance * 50;
		System.out.println(" Delivery charge : "+deliveryCharge);
		this.distance = distance;


	}
	void  calculateDiscount(double amount) {

		double discount2 = (amount * 2)/100;
		this.discount = discount2;

	}
	void estimateDeliveryTime() {
		double deliveryTime2 = distance / 4;
		this.deliveryTime = deliveryTime2;
		System.out.println("Delivery Time : "+deliveryTime);


	}
	void  displayOrderStatus() {
		System.out.println("Distance : "+distance);
		System.out.println("Discount : "+discount);
		System.out.println("Delivery Time : "+deliveryTime);
		System.out.println("Order is on the way ");

	}

}
class ZomatoDelivery extends FoodDelivery{


	void calculateDeliveryCharge(double distance) {


		double deliveryCharge = distance * 80;
		System.out.println(" Delivery charge : "+deliveryCharge);
		this.distance = distance;


	}
	void  calculateDiscount(double amount) {

		double discount2 = (amount * 2)/100;
		this.discount = discount2;

	}
	void estimateDeliveryTime() {
		double deliveryTime2 = distance / 4;
		this.deliveryTime = deliveryTime2;
		System.out.println("Delivery Time : "+deliveryTime);


	}
	void  displayOrderStatus() {
		System.out.println("Distance : "+distance);
		System.out.println("Discount : "+discount);
		System.out.println("Delivery Time : "+deliveryTime);
		System.out.println("Order is on the way ");


	}

}
class RestaurantDelivery extends FoodDelivery{


	void calculateDeliveryCharge(double distance) {


		double deliveryCharge = distance * 30;
		System.out.println(" Delivery charge : "+deliveryCharge);
		this.distance = distance;


	}
	void  calculateDiscount(double amount) {

		double discount2 = (amount * 4)/100;
		this.discount = discount2;

	}
	void estimateDeliveryTime() {
		double deliveryTime2 = distance / 3;
		this.deliveryTime = deliveryTime2;
		System.out.println("Delivery Time : "+deliveryTime);


	}
	void  displayOrderStatus() {
		System.out.println("Distance : "+distance);
		System.out.println("Discount : "+discount);
		System.out.println("Delivery Time : "+deliveryTime);
		System.out.println("Order is on the way ");


	}

}


public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chosee your chpice \n1.SwiggyDelivery\r\n"
				+ "2.ZomatoDelivery\r\n"
				+ "3.RestaurantDelivery\r\n"
				+ "");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1: {

			FoodDelivery f1 = new SwiggyDelivery();
			f1.calculateDeliveryCharge(45);
			f1.calculateDiscount(20);
			f1.estimateDeliveryTime();
			f1.displayOrderStatus();

			break;
		}
		case 2: {
			FoodDelivery f2 = new ZomatoDelivery();
			f2.calculateDeliveryCharge(5);
			f2.calculateDiscount(11);
			f2.estimateDeliveryTime();
			f2.displayOrderStatus();

			break;
		}
		case 3: {

			FoodDelivery f3 = new RestaurantDelivery();
			f3.calculateDeliveryCharge(7);
			f3.calculateDiscount(15);
			f3.estimateDeliveryTime();
			f3.displayOrderStatus();

			break;
		}
		default:

			System.out.println("Invalid input ");}


		sc.close();



	}

}
