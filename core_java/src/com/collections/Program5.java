package com.collections;

import java.util.ArrayList;

public class Program5 {
	public static void main(String[] args) {


		/*	Add 7 shopping items.
		Check whether "Milk" is present.
		Insert "Butter" at index 2.
		Replace "Sugar" with "Brown Sugar".
		Remove "Soap".
		Display the updated shopping cart.
		Print the total number of items.

		 */

		ArrayList<String> al = new ArrayList<>();


		al.add("Milk");
		al.add("Sugar");
		al.add("Soap");
		al.add("Biscuit");
		al.add("Shampoo");

		System.out.println(al);

		System.out.println("Milk Contains : "+al.contains("Milk"));
		al.add(2, "Butter");

		System.out.println("Insert Butter at index 2  completed  ");



		for(int i =0; i < al.size();i++) {
			if(al.get(i).equals("Sugar") ) {
				al.set(i, "Brown Sugar");

			}
		}

		al.remove("Soap");

		System.out.println(al);


	}

}
