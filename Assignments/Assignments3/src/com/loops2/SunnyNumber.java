package com.loops2;

import java.util.Scanner;

public class SunnyNumber {

	public static boolean isSunnyNumber(int num) {
		int next = num + 1;

		int root = (int) Math.sqrt(next);

		return root * root == next;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		SunnyNumber sn = new SunnyNumber();
		System.out.println(sn.isSunnyNumber(sc.nextInt())
				?"It is an sunny number" : "It is not an sunny number");

	}

}
