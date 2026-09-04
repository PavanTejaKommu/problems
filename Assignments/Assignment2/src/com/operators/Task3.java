package com.operators;

public class Task3 {


	public void getMarks(int st1 , int st2 ) {

		System.out.println("Leass Than          :"+(st1<st2));
		System.out.println("Greater Than        :"+(st1>st2));
		System.out.println("Less than or equals :"+(st1<=st2));
		System.out.println("Equalls to          :"+(st1==st2));
		System.out.println("Not Eqals           :"+(st1!=st2));


	}
	public static void main(String[] args) {

		Task3 tt = new Task3();		
		tt.getMarks(34, 56);

	}

}
