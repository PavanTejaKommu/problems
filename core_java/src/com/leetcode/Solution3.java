package com.leetcode;

import java.util.Stack;

public class Solution3 {

	public boolean isValid(String s) {
		Stack<String> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			String str = String.valueOf(s.charAt(i));
			if (str.equals("(") || str.equals("[") || str.equals("{")) {
				st.push(str);
			} else if (str.equals(")") || str.equals("}") || str.equals("]")) {
				if (st.isEmpty()) {
					return false;
				}

				String close = st.pop();

				if ((str.equals(")")) && (!close.equals("(")) || (str.equals("]")) && (!close.equals("["))
						|| (str.equals("}") && !close.equals("{"))) {
					return false;
				}
			}
		}
		/*
		 * System.out.println("After Addition Of elements : "+st); for (int i = 0; i <
		 * s.length(); i++) { String str = String.valueOf(s.charAt(i)); if
		 * (str.equals(")") || str.equals("]") || str.equals("}")) { st.pop(); } }
		 * System.out.println("After deletion Stack : " + st);
		 */

		if (st.size() == 0) {
			return true;
		}

		System.out.println(st);

		return false;
	}

	public static void main(String[] args) {
		Solution3 s3 = new Solution3();
		String str2 = "((()))";
		String str3 = "(]";
		String str4 = "([)]";
		
		

		System.out.println(s3.isValid(str4));

	}

}
