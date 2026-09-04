package com.loopingstatements;
import java.util.*;
public class Task1 {

	public void printingNaturalNumbers(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		Task1  obj = new Task1();
		obj.printingNaturalNumbers(sc.nextInt());


	}

}
