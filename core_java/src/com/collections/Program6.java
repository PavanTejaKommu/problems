package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Program6 {
	public static void main(String[] args) {

		 ArrayList<String> al = new ArrayList<>();
		 
		 al.add("java");
		 al.add("python");
		 
		 al.add("html");
		 
		 al.add("css");
		 
		 al.add("js");
		 
		 
		 
		 ArrayList<String> al2 = new ArrayList<>();
		 
		 
		 al2.add("java");
		 
		 al2.add("Physics");
		 
		 al2.add("math");
		 
		 al2.add("chgemistry");
		 
		 
		for(int i =0; i < al2.size();i++) {
			 if(al2.contains(al.get(i))) {
				 System.out.println(al2.get(i));
			 }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("java");
		ll.add("Python");
		ll.add("java");
		ll.add("html");
		
		LinkedList<String> ll2 = new LinkedList<>();
		
		
	}
}
