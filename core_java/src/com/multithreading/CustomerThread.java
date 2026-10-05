package com.multithreading;

public class CustomerThread extends Thread {

	Example2 obj = new Example2();
	@Override
	public void run() {
		obj.withdrawl(2000);

		obj.deposit(3000);

	}

	public CustomerThread(Example2 obj , String name) {
		super();
		this.obj = obj;
	}

	public static void main(String[] args) {

		System.out.println("Main Start ");

		CustomerThread ch1 = new CustomerThread( new Example2() , "Customer-1");

		CustomerThread ch2 = new CustomerThread(new Example2(), "Customer-2");

		ch1.start();
		ch2.start();

		System.out.println("Main End");


	}

}
