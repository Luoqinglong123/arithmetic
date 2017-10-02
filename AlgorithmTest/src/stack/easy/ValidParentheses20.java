package stack.easy;

import java.util.Stack;

public class ValidParentheses20 {

	public static void main(String[] args) {
		System.out.println(isValid1("(){}({}[])"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	public static boolean isValid1(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] cs = s.toCharArray();
		for (char c : cs) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}

		return stack.isEmpty();

	}
}
