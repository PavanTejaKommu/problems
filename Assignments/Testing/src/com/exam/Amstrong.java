package com.exam;

public class Amstrong {

	int sum =0;
	public int count(int number) {
		int count=0;
		while(number > 0) {
			count++;
			number= number/10;
		}
		return count;
	}

	public int power(int number , int count) {

		int power=1;

		for(int i =1;i<=count;i++) {

			power*=number;

		}
		return power;
	}


	public void calculate( int number ) {

int sum =0;
int count = count(number);
		while(number > 0) {
			int temp = number % 10;
		sum +=	power(temp, count);

			number/=10;

		}
if(sum == number) {
	System.out.println("Given number is amstrong ");
}else {
	System.out.println("Given number is not an amstrong");
}


	}


	public static void main(String[] args) {

		Amstrong am = new Amstrong();

		am.calculate(153);



	}

}
