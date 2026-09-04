package com.intial;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		CargoPlane c = new CargoPlane();

		PassengerPlane p = new PassengerPlane();

		FighterPlane f = new FighterPlane();



		System.out.println("1.Cargo plane \n2.passenger Plane \n3.Fighter Plane \n");

		System.out.println("Enter use requirement : \n");
		int num = sc.nextInt();
		sc.nextLine();

		if(num == 1) {
			c.fly();
		}else if(num == 2) {
			p.fly();
		}else if(num == 3) {
			f.fly();
		}else {
			System.out.println(" Please enter valid number ");
		}
		
		sc.close();

	}

}
