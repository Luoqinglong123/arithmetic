package stack.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI496 {

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			while(!stack.isEmpty()&&stack.peek()<nums1[i]){
				map.put(stack.pop(), nums1[i]);
			}
			stack.push(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			nums2[i]=map.get(nums2[i])==null?-1:map.get(nums2[i]);
		}
		return nums2;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] nums1={1,2,3,4};
		int[] nums2={2,4};
		for(int i: nextGreaterElement(nums1, nums2)){
			System.out.print(i+"\t");
		}
	}

	public static int[] nextGreaterElement1(int[] nums2, int[] nums1) {
		HashMap<Integer, Integer> map = new HashMap<>(); 
		Stack<Integer> stack = new Stack<>();
		for (int num : nums2) {
			while (!stack.isEmpty() && stack.peek() < num)
				map.put(stack.pop(), num);
			stack.push(num);
		}
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = map.get(nums1[i])==null?-1:map.get(nums1[i]);
		}
		return nums1;
	}
}
