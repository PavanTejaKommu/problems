package com.problemsolving;

public class Largest {

	public int sum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public int firstElement(int n) {
		int first = 0;
		while (n > 0) {
			int temp = n % 10;
			first = temp;
			n = n / 10;
		}
		return first;
	}

	public int max(int n) {
		int max = 0;
		while (n > 0) {
			int temp = n % 10;
			// System.out.println("Temp val : "+temp);
			if (temp > max) {

				max = temp;
			}
			// System.out.println("N value : "+n);
			n = n / 10;
		}
		return max;
	}

	public int smallest(int n) {
		int small = n;

		while (n > 0) {
			int temp = n % 10;
			if (small > temp) {
				small = temp;
			}
			n /= 10;
		}
		return small;
	}

	public int start(int n) {
		int temp = 0;
		while (n > 0) {
			n /= 10;
			if (n < 10 && n > 0) {
				temp = n;
			}
		}
		return temp;
	}

	public int noOfDigits(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;

	}

	public int product(int n) {
		int val = 1;

		while (n > 0) {
			int temp = n % 10;
			val *= temp;
			n /= 10;
		}
		return val;
	}

	public int reverseNum(int n) {
		int reversed = 0;
		while (n > 0) {
			int temp = n % 10;
			reversed = reversed * 10 + temp;
			n /= 10;
		}
		return reversed;
	}

	public int swaping(int n) {

		Math.pow(n, n);

		int first = n;
		int last = n % 10;
		int count = 0;
		while (n >= 10) {

			count++;
			n = n / 10;
			first = n;

		}
		int divisor = 1;
		for (int i = 0; i < count; i++) {
			divisor *= 10;
		}
		int middle = (n % divisor) / 10;
		int s = last * divisor + middle;
		return n;

	}

	public static void main(String[] args) {
		int num = 58321;
		int product = 234;
		int reversed = 1234;
		Largest l = new Largest();

		System.out.println("Max : " + l.max(num));
		System.out.println("Fist Element :  " + l.firstElement(num));
		System.out.println("Sum : " + l.sum(num));
		System.out.println("Smallest : " + l.smallest(num));

		System.out.println("First Number : " + l.start(num));
		System.out.println("Cpunt No : " + l.noOfDigits(num));

		System.out.println("Product : " + l.product(product));
		System.out.println("Reverse : " + l.reverseNum(reversed));

	}
}
