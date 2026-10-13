package com.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrderDriver {


	public static void main(String[] args) {

		ArrayList<Order> al2 = new ArrayList<>();

		Order order1 = new Order("Biscuit", 40, 50);
		Order order2 = new Order("Milk", 90, 78);
		Order order3 = new Order("Chaco", 21, 64);
		Order order4 = new Order("Juice", 35, 34);
		Order order5 = new Order("Bike", 30, 52);

		al2.add(order1);
		al2.add(order2);
		al2.add(order3);
		al2.add(order4);
		al2.add(order5);

		Comparator<Order> byProductname = new Comparator<Order>() {

			@Override
			public int compare(Order o1, Order o2) {

				return o1.productName.compareTo(o2.productName);
			}
		};
		Collections.sort(al2 , byProductname);
		for (Order order : al2) {
			System.out.println(order);
		}

		System.out.println();
		System.out.println("---------------------------");


		Comparator<Order> byPrice = new Comparator<Order>() {

			@Override
			public int compare(Order o1, Order o2) {

				return o1.price.compareTo(o2.price);
			}
		};
		Collections.sort(al2 , byPrice);
		
		for (Order order : al2) {
			System.out.println(order);
		}

		System.out.println();
		System.out.println("---------------------------");

		Comparator<Order> byQuantity = new Comparator<Order>() {

			@Override
			public int compare(Order o1, Order o2) {

				return o1.quantity.compareTo(o2.quantity);
			}
		};
		Collections.sort(al2 , byQuantity);
		for (Order order : al2) {
			System.out.println(order);
		}


	}




}
