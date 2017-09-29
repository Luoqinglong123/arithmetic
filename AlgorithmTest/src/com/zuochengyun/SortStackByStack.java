package com.zuochengyun;

import java.util.Stack;

public class SortStackByStack {
	public static void sort(Stack<Integer> stack) {
		Stack<Integer> help = new Stack<Integer>();
		while (!stack.empty()) {
			Integer pop = stack.pop();
			while (!help.empty()&&pop>help.peek()) {
					stack.push(help.pop());
			}
			help.push(pop);
		}
		while(!help.empty())
			stack.push(help.pop());
	}
}
