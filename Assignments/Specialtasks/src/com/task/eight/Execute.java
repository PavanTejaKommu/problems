package com.task.eight;

import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  Holder Name : ");
		String name = sc.nextLine();


		System.out.println("Enter Handler ID : ");
		String handler = sc.nextLine();


		StockPerformance sp = new StockPerformance(name, handler);


		int choice =0;
		boolean run = true;

		do {
			System.out.println("--- Menu ---\r\n"
					+ "1. Add Stock\r\n"
					+ "2. Recalculate Result\r\n"
					+ "3. View Summary\r\n"
					+ "4. Exit\r\n"
					+ "");

			System.out.println("Enter choice : ");
			choice = sc.nextInt();
			sc.nextLine();


			switch (choice) {
			case 1: {

				System.out.println("Enter Stock : ");
				int stock = sc.nextInt();
				sp.addStock(stock);

				break;
			}
			case 2:{
				System.out.println("Enter Grade : ");
				String grade = sc.nextLine();
				sp.recalculateResult(grade);
				break;
			}
			case 3:{
				sp.viewSummary();
				break;

			}
			case 4:{
				System.out.println("Exit");
				run = false;
				break;
			}
			default:
				System.err.println("Invalid Entry ");
				break;
			}


		}while(run);



		sc.close();
	}

}
