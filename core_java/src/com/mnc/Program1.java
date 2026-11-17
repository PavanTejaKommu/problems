package com.mnc;

public class Program1 {

	public static void main(String[] args) {
		int task = 1;
		System.out.println("Task :====> :  " + task);
		task++;
		// 1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("Task :====> :  " + task);
		task++;
		// 2
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 3
		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}

		System.out.println("Task :====> :  " + task);
		task++;
		// 4
		int val = 50;
		while (val >= 1) {
			System.out.println(val);
			val--;
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 5
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 6
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 7
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("Task :====> :  " + task);
		task++;
		// 8
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 9
		int natural = 1;
		while (natural <= 20) {
			System.out.println(natural);
			natural++;
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 10
		int natural2 = 1;
		while (natural <= 20) {
			if (natural2 % 2 == 0) {
				System.out.println(natural2);
			}
			natural2++;
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 11
		int natural3 = 1;
		while (natural3 <= 20) {
			if (natural3 % 2 != 0) {
				System.out.println(natural3);
			}
			natural3++;
		}

		System.out.println("Task :====> :  " + task);
		task++;
		// 12
		for (int i = 100; i <= 200; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 13
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 14
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 15
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;

		// 16
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " Square => " + (i * i));
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 17
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " Square => " + (i * i * i));
		}

		System.out.println("Task :====> :  " + task);
		task++;
		// 18
		for (int i = 1; i <= 10; i++) {
			System.out.println("1 X " + i + " = " + (1 * i));
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("2 X " + i + " = " + (2 * i));
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("3 X " + i + " = " + (3 * i));
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("4 X " + i + " = " + (4 * i));
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 X " + i + " = " + (5 * i));
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 19
		int numberCount = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				numberCount++;
			}

		}
		System.out.println(numberCount);

		System.out.println("Task :====> :  " + task);
		task++;
		// 20
		int sum20 = 0;
		for (int i = 1; i <= 50; i++) {
			sum20 += i;
		}
		System.out.println(sum20);

		System.out.println("Task :====> :  " + task);
		task++;
		// 21
		int sumEven = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		System.out.println(sumEven);
		System.out.println("Task :====> :  " + task);
		task++;
		// 22
		int oddSum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			}
		}
		System.out.println(oddSum);
		System.out.println("Task :====> :  " + task);
		task++;
		// 23
		int fiveSum = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 5 == 0) {
				fiveSum += i;
			}
		}
		System.out.println(fiveSum);
		System.out.println("Task :====> :  " + task);
		task++;
		// 24
		int product24 = 1;
		for (int i = 1; i <= 5; i++) {
			product24 *= i;
		}
		System.out.println(product24);
		System.out.println("Task :====> :  " + task);
		task++;
		// 25
		int given = 5;
		int factorial25 = 1;
		for (int i = 1; i <= given; i++) {
			factorial25 *= i;
		}
		System.out.println(factorial25);
		System.out.println("Task :====> :  " + task);
		task++;
		// 26
		int i26 = 1;
		int factorial26 = 1;
		while (i26 <= 5) {
			factorial26 *= i26;
			i26++;
		}
		System.out.println(factorial26);
		System.out.println("Task :====> :  " + task);
		task++;
		// 27
		int count27 = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				count27++;
			}
		}
		System.out.println(count27);
		System.out.println("Task :====> :  " + task);
		task++;
		// 28
		int count28 = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				count28++;
			}
		}
		System.out.println(count28);
		System.out.println("Task :====> :  " + task);
		task++;
		// 29
		int count29 = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				count29++;
			}
		}
		System.out.println(count29);
		System.out.println("Task :====> :  " + task);
		task++;
		// 30
		int start30 = 10;
		int end30 = 20;
		int sum30 = 0;
		for (int i = start30; i <= end30; i++) {
			sum30 += i;
		}
		System.out.println(sum30);
		System.out.println("Task :====> :  " + task);
		task++;
		// 31
		int start31 = 10;
		int end31 = 20;
		int sum31 = 0;
		for (int i = start31; i <= end31; i++) {
			if (i % 2 == 0) {
				sum31 += i;
			}
		}
		System.out.println("-----");
		System.out.println(sum31);
		System.out.println("Task :====> :  " + task);
		task++;
		// 32
		int start32 = 10;
		int end32 = 20;
		int sum32 = 0;
		for (int i = start32; i <= end32; i++) {
			if (i % 2 != 0) {
				sum32 += i;
			}
		}
		System.out.println(sum32);
		System.out.println("Task :====> :  " + task);
		task++;
		// 33
		int count33 = 0;
		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			if (i % 5 == 0) {
				count33++;
				System.out.println(i);

			}
			if (count33 == 5)
				break;
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 34
		int count34 = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (i % 3 == 0) {
				count34++;
				System.out.println(i);
			}
			if (count34 == 5)
				break;
		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 35
		int num35 = 2;
		int power35 = 5;
		int total35 = 1;
		int i35 = power35;
		while (i35 >= 1) {
			total35 *= num35;
			i35--;
		}

		System.out.println("Total 35 :" + total35);
		System.out.println("Task :====> :  " + task);
		task++;
		// 36
		int num36 = (int) Math.pow(2, 4);
		System.out.println(num36);
		System.out.println("Task :====> :  " + task);
		task++;
		// 37
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}

		}
		System.out.println("Task :====> :  " + task);
		task++;
		// 38
		int sum38 = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum38 += i;
			}
		}
		System.out.println(sum38);
		System.out.println("Task :====> :  " + task);
		task++;
		// 39

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;

		// 40
		int n40 = 12345;
		int temp = n40;
		int count40 = 0;
		while (temp > 0) {
			int rem = temp % 10;
			count40++;
			temp /= 10;
		}
		System.out.println(count40);
		System.out.println("Task :====> :  " + task);
		task++;

		// 41
		int temp41 = n40;
		int sum41 = 0;

		while (temp41 != 0) {
			int rem = temp41 % 10;
			sum41 += rem;
			temp41 /= 10;
		}
		System.out.println(sum41);
		System.out.println("Task :====> :  " + task);
		task++;

		// 42
		int temp42 = n40;
		int product42 = 1;

		while (temp42 != 0) {
			int rem = temp42 % 10;
			product42 *= rem;
			temp42 /= 10;
		}
		System.out.println(product42);
		System.out.println("Task :====> :  " + task);
		task++;

		// 43
		int temp43 = n40;
		int largest43 = 0;
		while (temp43 != 0) {
			int rem = temp43 % 10;
			if (rem > largest43) {
				largest43 = rem;
			}
			temp43 /= 10;
		}
		System.out.println(largest43);
		System.out.println("Task :====> :  " + task);
		task++;

		// 44
		int temp44 = n40;
		int smallest44 = temp44;
		while (temp44 != 0) {
			int rem = temp44 % 10;
			if (rem < smallest44) {
				smallest44 = rem;
			}
			temp44 /= 10;
		}
		System.out.println(smallest44);
		System.out.println("Task :====> :  " + task);
		task++;

		// 45

		int temp45 = n40;
		int count45 = 0;
		while (temp45 != 0) {
			count45++;
			temp45 /= 10;
		}
		System.out.println(count45);

		System.out.println("Task :====> :  " + task);
		task++;

		// 46
		int temp46 = n40;
		int count46 = 0;
		while (temp46 != 0) {
			int rem = temp46 % 10;
			if (rem % 2 != 0) {
				count46++;
			}
			temp46 /= 10;
		}
		System.out.println(count46);
		System.out.println("Task :====> :  " + task);
		task++;

		// 47
		int temp47 = n40;
		int count47 = 0;
		while (temp47 != 0) {
			int rem = temp47 % 10;
			if (rem == 5) {
				count47++;
			}
			temp47 /= 10;
		}
		System.out.println(count47);
		System.out.println("Task :====> :  " + task);
		task++;

		// 48
		int temp48 = n40;
		int count48 = 0;
		while (temp48 != 0) {
			int rem = temp48 % 10;
			if (rem == 4) {
				count48++;
			}
			temp48 /= 10;
		}
		System.out.println(count48);
		System.out.println("Task :====> :  " + task);
		task++;

		// 49

		int temp49 = n40;

		while (temp49 != 0) {

			if (temp49 < 10) {
				System.out.println(temp49);
			}
			temp49 /= 10;
		}
		System.out.println("Task :====> :  " + task);
		task++;

		// 50
		int temp50 = n40;
		System.out.println(temp50 % 10);

		System.out.println("Task :====> :  " + task);
		task++;

		// 51
		int temp51 = n40;
		while (temp51 != 0) {
			System.out.println(temp51 % 10);
			temp51 /= 10;
		}
		// 52

		int temp52 = n40;
		String str52 = "";
		while (temp52 != 0) {
			str52 = (temp52 % 10) + str52;
			temp52 /= 10;
		}

		System.out.println("Task :====> :  " + task);
		task++;

		// 53

		int temp53 = n40;
		String str53 = "";
		while (temp53 != 0) {
			str53 = (temp53 % 10) + str53;
			temp53 /= 10;
		}

		System.out.println("Task :====> :  " + task);
		task++;
		// 54
		int temp54 = n40;
		int original54 = n40;
		int reverse54 = 0;
		while (temp45 != 0) {
			reverse54 += (reverse54 * 10) + (temp54 % 10);
			temp54 /= 10;

		}
		if (original54 == reverse54) {
			System.out.println("Palindrome ");
		} else {
			System.out.println("not an palindrome ");
		}

		System.out.println("Task :====> :  " + task);
		task++;

		// 55

		int num55 = 153;
		int original55 = num55;
		int temp55 = 0;
		int reverse55 = 0;
		while (num55 != 0) {
			int rem = num55 % 10;
			reverse55 = reverse55 * 10 + rem;

			int powerValue = (int) Math.pow(rem, 3);
			temp += powerValue;
			num55 /= 10;
		}
		if (original55 == temp55) {
			System.out.println("It is an amstrong ");
		} else {
			System.out.println("not an amstrong");
		}

		System.out.println("Task :====> :  " + task);
		task++;

		// 56

		int num56 = 1569;

		int smallest56 = Integer.MAX_VALUE;
		int largest56 = Integer.MIN_VALUE;
		while (num56 != 0) {
			int rem = num56 % 10;
			if (rem > largest56) {
				largest56 = rem;
			} else if (rem < smallest56) {
				smallest56 = rem;
			}
			num56 /= 10;
		}

		System.out.println(largest56 - smallest56);

		System.out.println("Task :====> :  " + task);
		task++;

		// 57
		int num57 = n40;
		int count57 = 0;
		while (num57 != 0) {
			if (num57 % 10 > 5) {
				count57++;
			}
			num57 /= 10;
		}
		System.out.println(count57);

		System.out.println("Task :====> :  " + task);
		task++;

		// 58
		int num58 = n40;
		int count58 = 0;
		while (num58 != 0) {
			if (num58 % 10 < 5) {
				count58++;
			}
			num58 /= 10;
		}
		System.out.println(count58);

		System.out.println("Task :====> :  " + task);
		task++;

		// 59
		int num59 = 23;
		int count59 = 0;
		for (int i = 2; i < num59; i++) {
			if (num59 % i == 0) {
				count59++;
			}
		}
		String str59 = (count59 == 0) ? "it is prime number" : "it is not prime";
		System.out.println(str59);
		System.out.println("Task :====> :  " + task);
		task++;

		// 60
		for (int i = 1; i <= 20; i++) {
			int count60 = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count60++;
				}
			}
			if (count60 == 2) {
				System.out.println(i);
			}
		}
		System.out.println("Task :====> :  " + task);
		task++;

//61
		int countPrime61 = 0;
		for (int i = 1; i <= 50; i++) {
			int count61 = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count61++;
				}
			}
			if (count61 == 2) {
				countPrime61++;
			}
		}
		System.out.println(countPrime61);
		System.out.println("Task :====> :  " + task);
		task++;

		// 62

		int sumPrime62 = 0;
		for (int i = 1; i <= 50; i++) {
			int count62 = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count62++;
				}
			}
			if (count62 == 2) {
				sumPrime62 += i;
			}
		}
		System.out.println(sumPrime62);
		System.out.println("Task :====> :  " + task);
		task++;

		// 63
		int num63 = 6;
		int sum63 = 0;
		for (int i = 1; i <= num63; i++) {
			if (num63 % i == 0) {
				sum63 += i;
			}
		}
		System.out.println(sum63);
		System.out.println("Task :====> :  " + task);
		task++;

		// 64

		for (int i = 1; i <= 30; i++) {
			int sum64 = 0;
			for (int j = 1; j < i; j++) {

				if (i % j == 0) {
					sum64 += j;
				}
			}
			if (sum64 == i) {

				System.out.println(i);

			}
		}
		System.out.println("Task :====> :  " + task);
		task++;

		// 65

		int num65 = 153;
		int count65 = 0;
		int original = num65;
		int temp65 = num65;
		int sum65 = 0;
		while (num65 != 0) {
			count65++;
			num65 /= 10;
		}
		while (temp65 != 0) {
			int product65 = 1;

			int rem = temp65 % 10;
			for (int i = 1; i <= count65; i++) {
				product65 = product65 * rem;
			}
			sum65 += product65;
			temp65 /= 10;
		}
		if (original == sum65) {
			System.out.println("It is an amstrong");
		} else {
			System.out.println("It is not an amstrong");
		}
		System.out.println("Task :====> :  " + task);
		task++;

		// 66
		for (int i = 1; i <= 500; i++) {
			int num66 = i;
			int count66 = 0;
			int original66 = num66;
			int temp66 = num66;
			int sum66 = 0;
			while (num66 != 0) {
				count66++;
				num66 /= 10;
			}
			while (temp66 != 0) {
				int product66 = 1;

				int rem = temp66 % 10;
				for (int p = 1; p <= count66; p++) {
					product66 = product66 * rem;
				}
				sum66 += product66;
				temp66 /= 10;
			}
			if (original66 == sum66) {
				System.out.println(i);
			}

		}

		System.out.println("Task :====> :  " + task);
		task++;

		// 67
		int num67 = 145;
		int original67 = num67;
		int sum67 = 0;
		while (num67 != 0) {
			int rem = num67 % 10;
			int product67 = 1;
			for (int i = 1; i <= rem; i++) {
				product67 *= i;
			}
			sum67 += product67;
			num67 /= 10;
		}
		if (sum67 == original67) {
			System.out.println("Its an strong Numner ");
		} else {
			System.out.println("Its not an strong");
		}

		System.out.println("Task :====> :  " + task);
		task++;

		// 68

		for (int p = 1; p <= 500; p++) {
			int num68 = p;
			int original68 = num68;
			int sum68 = 0;
			while (num68 != 0) {
				int rem = num68 % 10;
				int product68 = 1;
				for (int i = 1; i <= rem; i++) {
					product68 *= i;
				}
				sum68 += product68;
				num68 /= 10;
			}

			if (sum68 == original68) {
				System.out.println(p);
			}

		}

		System.out.println("Task :====> :  " + task);
		task++;

		// 69
		int a69 = 48;
		int b69=18;
		
		while(b69 !=0) {
			int rem = a69 % b69;
			a69=b69;
			b69=rem;
		}
		System.out.println(a69);
		System.out.println("Task :====> :  " + task);
		task++;
		
		//70
		

		/*
		 * Find the LCM of two integers
		 * using a loop. Check whether two numbers are co-prime. Find the number of
		 * factors of a given integer. Print all factors of a given integer. Find the
		 * sum of all factors of a given integer. Check whether a number is a
		 * Harshad/Niven number. Example: 18 → 1 + 8 = 9, and 18 % 9 == 0 Print the
		 * Fibonacci series for N terms using a loop. Find the second-largest digit in a
		 * given integer without converting it to a string.
		 * 
		 */

	}

}
