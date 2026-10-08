package com.strings;

public class Example22 {
	private String str;

	public Example22(String str) {
		super();
		this.str = str;
	}

	private void isChanged() {
		int left =0;
		int right = str.length()-1;
		char arr []  = str.toCharArray();

		while(left < right) {
			if(str.charAt(left) != 'a' &&  str.charAt(left) != 'a' && 
					str.charAt(left) != 'a' && str.charAt(left) != 'a' && str.charAt(left) != 'a') {
				left++;
			}

			else	if(str.charAt(right) != 'a' && str.charAt(right) != 'e' &&
					str.charAt(right) != 'i' && str.charAt(right) != 'o' && str.charAt(right) != 'u'  ) {
				right--;
			}else {



			char temp = arr[left];
			arr[left] = arr[right];
			arr[right]=temp;
			left++;
			right--;
			}

		}
	}

	public static void main(String[] args) {
		String str = "hello";
		Example21 exam = new Example21(str);

		exam.isChanged();

	}

}
