package stack.easy;

import java.util.Stack;

public class MinStack155 {
	long min;
	Stack<Long> stack;

	public MinStack155() {
		stack = new Stack<>();
	}

	public void push(Integer x) {
		if (stack.isEmpty()) {
			stack.push(0L);
			min = x;
		} else {
			stack.push(x - min);
			if (x < min)
				min = x;
		}
	}

	public Integer getMin() {
		return (int) min;
	}

	public void pop() {
		if (stack.isEmpty())
			throw new RuntimeException("Õ»Îª¿Õ");
		Long pop = stack.pop();
		if(pop<0)
			min=min-pop;
	}

	public int top() {
		if (stack.isEmpty())
			throw new RuntimeException("Õ»Îª¿Õ");
		Long peek = stack.peek();
		if(peek>0)
			return (int) (peek+min);
		return (int) min;
		
		
	}

}
