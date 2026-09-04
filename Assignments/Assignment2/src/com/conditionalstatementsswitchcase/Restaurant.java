package com.conditionalstatementsswitchcase;

import java.util.Scanner;

public class Restaurant {
	
	public void menu() {
		System.out.println("Current menu : ");
		System.out.println("1 Pizza ");
		System.out.println("2 Burger ");
		System.out.println("3 Sanswitch ");
		System.out.println("4 Coffe ");
	}
	
	
	public void calculation(String order) {
		switch (order) {
		case "1":
		{
			System.out.println(" You selected Pizza  : Prize 250");
			break;
		}
		case "2":
		{
			System.out.println("You selected Burger :  Prize 150 ");
			break;
		}
		case "3":{
			System.out.println("You selected Sandwith  :  Prize 120");
			break;
			
		}
		case "4":{
			System.out.println("You selected coffe  :  Prize 80");
			break;
			
		}
		default :
		{
			System.err.println("Invalid input ");
			
			break;
		
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Restaurant obj = new Restaurant();
		obj.menu();
		
		System.out.println("Please select oeder : ");
		obj.calculation(sc.next());
	}

}
