package com.functionaIinterface;

interface  CharChecker2{
	
	void  checkChar(char a);
	
}




public class Example3 {
	
	public static void main(String[] args) {
		
		CharChecker2 ch = new CharChecker2() {
			
			@Override
			public void checkChar(char a) {
				System.out.println((int)'A');
				
			}
		};
		
		ch.checkChar('b');
		
		
	}
	
	

}
