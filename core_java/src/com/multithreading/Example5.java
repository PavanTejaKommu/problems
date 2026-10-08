package com.multithreading;
class Printer3{

	public   void print(int n , String name) {
		for(int i =1; i <= n ; i++) {
			System.out.println(name+"-"+i);
		}
	}
}

// object level synchronization 
public class Example5 {
	public static void main(String[] args) {

		Printer3 printer = new Printer3();
		Runnable rh1 = ()->{
			synchronized (printer) {
				printer.print(5, "Teja");
			}

		};
		
		Runnable rh2 = ()->{
			synchronized (printer) {
				printer.print(5, "Pavan");
			}
		};
		
		Thread th1 = new Thread(rh1);
		Thread th2 = new Thread(rh2);
		
		th1.start();
		th2.start();
	}
}
