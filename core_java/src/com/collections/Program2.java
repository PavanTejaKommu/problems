package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program2 {
	public static void main(String[] args) {
		
		// set
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(23);
		ts.add(45);
		ts.add(3);
		ts.add(12);
		System.out.println("Streem : "+ts.stream());
		System.out.println("hash code  :" + ts.hashCode());
		System.out.println("size : " + ts.size());
		System.out.println("ceiling :" +  ts.ceiling(45));
		System.out.println("first : " +  ts.first());
		System.out.println("Get Firset : " +  ts.getFirst());
		System.out.println("get Last :" + ts.getLast());
		System.out.println("Higher :" + ts.higher(3));
		System.out.println("Lower : " +ts.lower(6));

		System.out.println(ts);







		LinkedHashSet<Integer> ls = new LinkedHashSet<>();

		ls.add(23);
		ls.add(79);
		ls.add(45);
		ls.add(null);
		System.out.println(ls.getFirst());
		System.out.println(ls);



		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		lhs.add("Teja");
		lhs.add("Pavan");
		lhs.add("Niky");
		lhs.add("Dolly");
		lhs.add("23");
		lhs.add("none");
		System.out.println(lhs.contains("teja"));
		System.out.println("is empty : "+lhs.isEmpty());
		System.out.println();
		System.out.println("All : "+lhs);

		HashSet<Integer> hs = new HashSet<>();
		hs.add(23);
		hs.add(45);
		hs.add(93);
		hs.add(45);
		hs.add(73);
		hs.add(45);
		hs.add(83);
		hs.add(39);
		hs.add(23);
		hs.add(null);
		hs.add(23);
		hs.add(79);
		System.out.println(hs);
		System.out.println(hs.iterator());
		System.out.println(hs.toString());
		System.out.println(hs.getClass());
		System.out.println("Conatins : "+hs.contains(23));
		System.out.println("Is empty : "+hs.isEmpty());
		System.out.println(hs);

	}

}
