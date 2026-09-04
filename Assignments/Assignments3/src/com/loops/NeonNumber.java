package com.loops;
import java.util.*;
public class NeonNumber {
	public boolean isneon(int num) {
		int temp = num;
		int sum = 0;
		int square = num * num;
		while(square > 0) {
			int resu = square % 10;

			sum = sum +resu;
			square = square/10;

		}
		System.out.println("Sum "+sum);
		return  temp == sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		NeonNumber nn = new NeonNumber();
		System.out.println(nn.isneon(sc.nextInt())
				?"Is  a Neon Number ": "Is not a Neon");
	}

}
