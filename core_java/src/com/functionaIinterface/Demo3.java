package com.functionaIinterface;

interface NumberChecker2 {

	public boolean checkNumber(int a);	


}
public class Demo3 {


	public static void main(String[] args) {

		NumberChecker2 nb = new NumberChecker2() {

			@Override
			public boolean checkNumber(int a) {
				
				int count =0;
				boolean flag = false;
				for(int i = 1; i<=a; i++) {
					if(a%i == 0) {
						count++;
					}

				}
				
				if(count <=2) {
					flag = true;
				}
				
				return flag;
			}
		};


		System.out.println(nb.checkNumber(83));
	}
}
