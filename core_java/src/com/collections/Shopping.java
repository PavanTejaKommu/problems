package com.collections;

import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {


		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Ball");
		al2.add("Bat");
		al2.add("Soap");
		al2.add("Cap");
		al2.add("Jersy");
		al2.add("Pads");
		al2.add("Stumps");
		al2.add("Bails");
		al2.add("Sugar");

		al2.contains("Milk");
		al2.set(2, "Butter");

		al2.set(al2.indexOf("Sugar"), "Brown Sugar");
		al2.remove("Soap");
		System.out.println("Updated Shoping Cart : "+al2);
		System.out.println("Total No of Items : "+ al2.size());

	}


}
