package com.functionaIinterface;

import java.util.function.Consumer;


class Demo{
	Integer i ;

	public Demo(Integer i) {
		super();
		this.i = i;
	}
	
	public int check() {
		return this.i;
	}
	
	
}

public class Example1 {
	public static void main(String[] args) {
		
		Demo d = new Demo(25);
		
		Consumer<Demo> consumer = new Consumer<Demo>() {
			
			@Override
			public void accept(Demo num) {
				
			
				if(d.check() == 0 ) {
					System.out.println("It is an even Number ");
				}else {
					System.out.println("It is not an even Number ");
				}
				
			}
		};
		
		
		consumer.accept(d);
		
	}

}
