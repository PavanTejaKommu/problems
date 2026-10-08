package com.multithreading;

class Producer implements Runnable{
	
	StringBuffer stringbuffer;
	
	
	
Producer(){
	this.stringbuffer = stringbuffer;
}
	
	@Override
	public void run() {
		
		for(int i =1; i <= 10; i++) {
			stringbuffer.append(i);
			System.out.println(i+":" );
			
		}
		
	
	
}
class consumer implements Runnable{

	Producer producer;
	
	public consumer(Producer producer) {
	this.producer = producer;
		
	}
	@Override
	public void run() {
		
		try {
			System.out.println("waiting for notificaton ");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
public class Example6 {
	public static void main(String[] args) {
		
	}
}
}



