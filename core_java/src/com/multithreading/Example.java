package com.multithreading;

class A {
	int count;
	public void increment() {
		count++;
		System.out.println(Thread.currentThread().getName());
	}

	int getCount() {
		return count;
	}
}

public class Example {
	public static void main(String[] args) {

		System.out.println("Main Start");

		A obj = new A();

		Thread th1 = new Thread(()->

		{
			for(int i =1 ; i<=100;i++) {
				obj.increment();
			}
			System.out.println(obj.getCount());

		}
				);


		Thread th2 = new Thread(()->

		{
			for(int i =1 ; i<=100;i++) {
				obj.increment();
			}
			
			System.out.println(obj.getCount());
		}
				);



		th1.start();
		th2.start();

		System.out.println(obj.getCount());

		System.out.println("Main End");



		//		 Runnable run = ()-> System.out.println("Hello");

		//		 Thread th = new Thread(() -> System.out.println("Hello"));




	}

}
