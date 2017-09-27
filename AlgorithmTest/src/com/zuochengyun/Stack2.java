package com.zuochengyun;

import java.util.Stack;

public class Stack2 {
	
	public static void main(String[] args) {
	Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		Stack reverse = reverse(stack);
		System.out.println(reverse.pop());
		System.out.println(reverse.pop());
		System.out.println(reverse.pop());
		System.out.println(reverse.pop());
		System.out.println(reverse.pop());
	}
	public static int getAmdRemoveLastElement(Stack<Integer> stack) {
		Integer result = stack.pop();
		if (stack.empty())
			return result;
		else {
			int lastElement = getAmdRemoveLastElement(stack);
			stack.push(result);
			return lastElement;
		}
	}
	
	public static int fact(int n){
		int res = n+n;
		if(n==1)
			return 1;
		else{
			int a  = fact(n-1)*n;
			System.out.println(res);
			return a;
		}
	}
	public static Stack reverse(Stack<Integer> stack){
		
		if(stack.empty()){
			return null; 
		}
		int push = getAmdRemoveLastElement(stack);
		reverse(stack);
		stack.push(push);
		return stack;
	}
}
