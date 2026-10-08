package com.multithreading;
class Printer2{

	public  static void print(int n , String name) {
		for(int i =1; i <= n ; i++) {
			System.out.println(name+"-"+i);
		}

	}
}


// class level stnchronization
public class Example4 {

	public static void main(String[] args) {


		Runnable run1 = ()->{
			Printer2.print(5, "Teja");

		};

		Runnable run2 = ()->{
			Printer2.print(5, "Pavan");

		};


		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);


		th1.start();
		th2.start();

	}
}
