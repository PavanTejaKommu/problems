package com.multithreading;
class Printer{
	public synchronized void print(int n , String name) {
		for(int i =1; i < n ; i++) {
			System.out.println(name+"- "+i);
		}
		
	}
}

// method level synchronization



public class Example3 {
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		Runnable run1 = ()->{
			printer.print(10, "Pavan");
			
		};
		
		
		Runnable run2 = ()->{
			printer.print(10, "Teja");
			
		};
		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);
		
		th1.start();
		th2.start();
		
		
	}

}
