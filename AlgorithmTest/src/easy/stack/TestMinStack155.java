package easy.stack;

import org.junit.Test;

public class TestMinStack155 {

	@Test
	public void test() {
		MinStack155 minStack = new MinStack155();
		minStack.push(-2);
		System.out.println(minStack.top());
		minStack.push(0);
		System.out.println(minStack.top());
		minStack.push(-3);
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.getMin());
	}
}
