package com.greatlearning.main;

import java.util.Stack;

public class BalancingBrackets {
	private static boolean isBalanced(String bracketExpression) {
		Stack<Character> stack = new Stack<Character>();
		// iterate through the characters
		for (char c : bracketExpression.toCharArray()) {
			// System.out.println( c );

			// check if c is '(', '{', '['

			if (c == '(' || c == '{' || c == '[') {
				// push to stack
				stack.push(c);

			} else {

				if (stack.isEmpty()) {
					return false;
				}
				// pop from the stack (d)
				Character d = (Character) stack.pop();
				// check if c is the closing bracket for d
				if (c == '}' && d != '{' || (c == ')' && d != '(') || (c == ']' && d != '[')) {
					return false;

				}

				// pop from the stack (d)
				// check if c is the closing bracket for d
				// if not then return false
			}

		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String bracketExpression = "([[{}]])";
		// String bracketExpression = "([[{}]]))";

		if (isBalanced(bracketExpression)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
