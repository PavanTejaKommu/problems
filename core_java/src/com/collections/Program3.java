package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Program3 {


	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		Program3 p3 = new Program3();
		
		ArrayList<Object> al2 = new ArrayList<>();
		System.out.println(al2.add(p3));

		al.add(23);
		al.add(20);
		al.add(12);
		al.add(26);
		al.add(48);
		al.add(29);


		Iterator<Integer> i = al.iterator()	;

		while(i.hasNext()) {

			int num = (Integer)

					i.next();	
			System.out.println(num);

			System.out.println(i.next());


		}

		System.out.println("Ietarator **************** ");
		Iterator<Integer> li = al.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}

		ListIterator<Integer> Li = al.listIterator(al.size());

		System.out.println("List iterator ");

		while(Li.hasPrevious()) {
			System.out.println(Li.previous());
		}







	}

}
