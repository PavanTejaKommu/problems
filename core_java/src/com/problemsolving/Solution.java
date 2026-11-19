package com.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	// 1
	public void studentSum() {
		int[] arr = { 70, 80, 65, 90, 75 };
		int sum = 0;
		for (Integer i : arr) {
			sum += i;
		}
		System.out.println("Total students Sum : " + sum);

	}
	// 2

	public void highestScore() {
		int[] arr = { 45, 89, 67, 92, 78 };
		int max = 0;
		for (Integer i : arr) {
			if (i > max)
				max = i;
		}
		System.out.println("Highest Score : " + max);
	}

	// 3

	public void lowestScore() {
		int[] arr = { 45, 89, 67, 12, 78 };
		int min = Integer.MAX_VALUE;

		for (Integer i : arr) {
			if (min > i)
				min = i;
		}
		System.out.println("Lowest score : " + min);
	}

	// 4
	public void evenOrOdd() {
		int[] arr = { 10, 15, 20, 25, 30 };
		int evenCount = 0;
		int oddCount = 0;

		for (Integer i : arr) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Even : " + evenCount);
		System.out.println("Odd : " + oddCount);
	}

	// 5
	public void reverseArray() {
		int[] arr = { 10, 20, 30, 40, 50 };

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println("Reversed Array : " + Arrays.toString(arr));
	}

	// 6
	public void elementFind() {
		int[] arr = { 10, 20, 30, 40, 50, 36 };
		int target = 36;

		for (Integer i : arr) {
			if (i == target) {
				System.out.println("Element found : " + i);
				break;
			}
		}

	}

	// 7

	public void secondHighestScore() {
		int[] arr = { 10, 50, 30, 50, 40 };
		int firstH = 0;
		int secondH = 0;

		for (Integer i : arr) {
			if (i > firstH) {
				secondH = firstH;
				firstH = i;
			}

			if (i < firstH && i > secondH) {
				secondH = i;
			}
		}

		System.out.println("SEcond Highest Score : " + secondH);
	}
	// 8

	public void average() {
		int[] arr = { 10, 20, 30, 40, 50 };
		int avg = 0;
		int aboveCount = 0;
		for (Integer i : arr) {
			avg += i;
		}
		avg = avg / arr.length;

		for (Integer i : arr) {
			if (i > avg) {
				aboveCount++;
			}
		}
		System.out.println("Average : " + avg);
		System.out.println("Above avg Count : " + aboveCount);
	}

	// 9
	public void duplicate() {
		int[] arr = { 2, 4, 3, 2, 5, 4, 6 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}

			}
			if (count >= 1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	// 10
	public void frequencyCount() {
		int[] arr = { 1, 2, 2, 3, 1, 1 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			System.out.println(arr[i] + " Frequency " + count);
		}

	}

	// 11
	public void unique() {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	// 12
	public void missing() {
		int[] arr = { 1, 2, 4, 5 };
		int sum = 0;
		int temp = 0;
		for (int i = 1; i <= arr.length + 1; i++) {
			temp += i;
		}
		for (Integer i : arr) {
			sum += i;
		}
		System.out.println("Missing Value : " + (temp - sum));

	}

	// 13
	public void arrayRotation() {
		// Move the first element to the last position.
		int[] arr = { 10, 20, 30, 40, 50 };

		int Temparr[] = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			Temparr[i - 1] = arr[i];

			if ((i + 1) == arr.length) {
				Temparr[i] = arr[0];
			}
		}
		System.out.println(Arrays.toString(Temparr));

	}

	// 14
	public void rotation() {
		int[] arr = { 10, 20, 30, 40, 50 };

		int left = arr.length - 2;
		int right = arr.length - 1;
		while (left >= 0) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left--;
			right--;
		}

		System.out.println(Arrays.toString(arr));
	}

	// 15
	public void moveZeros() {
		int[] arr = { 0, 5, 0, 3, 8, 0, 2 };

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			
			if (arr[left] == 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}

	// 16
	public void checkaArray() {
		int[] a = { 10, 20, 30 };
		int[] b = { 10, 20, 30 };
		if (a.length != b.length)System.out.println("Not same");
			
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				System.out.println("NOt Same ");
				break;
			}
		}
		System.out.println("Equal");
	}

	// 17
	public void removeDuplicate() {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4 };

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (Integer i : arr) {
			if (!al.contains(i))
				al.add(i);
		}
		System.out.println(al);
	}

	
	//18 
	public void moveZeros2() {
		int[] arr = { 0, 5, 0, 3, 8, 0, 2 };

		int left = 0;
		int right = 1;

		while (right < arr.length) {
			
			if(arr[right] != 0) {
				int temp =arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}
			
			right++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Solution obj = new Solution();

		obj.studentSum();
		obj.highestScore();
		obj.lowestScore();
		obj.evenOrOdd();
		obj.reverseArray();
		obj.elementFind();
		obj.secondHighestScore();
		obj.average();
		obj.duplicate();
		obj.frequencyCount();
		obj.unique();
		obj.missing();
		obj.arrayRotation();
		obj.rotation();
		obj.moveZeros();
		obj.checkaArray();
		obj.removeDuplicate();
		obj.moveZeros2();
		// obj.arrayRotation();
		// obj.rotation();
		// obj.removeDuplicate();
	}

}
