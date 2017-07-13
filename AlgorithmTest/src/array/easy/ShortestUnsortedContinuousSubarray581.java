package array.easy;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 *
 *         Given an integer array, you need to find one continuous subarray that
 *         if you only sort this subarray in ascending order, then the whole
 *         array will be sorted in ascending order, too.
 * 
 *         You need to find the shortest such subarray and output its length.
 *         Input: [2, 6, 4, 8, 10, 9, 15] Output: 5 Explanation: You need to
 *         sort [6, 4, 8, 10, 9] in ascending order to make the whole array
 *         sorted in ascending order.
 */
public class ShortestUnsortedContinuousSubarray581 {
	public static void main(String[] args) {
		int[] nums = { 2, 6, 4, 8, 10, 9, 15, 99, 28 };
		int subarray = findUnsortedSubarray2(nums);
		System.out.println(subarray);
	}

	public static int findUnsortedSubarray1(int[] nums) {
		if (nums[0] < nums[nums.length - 1]) {
			Arrays.sort(nums);
		}
		return nums.length - 2;
	}

	public static int findUnsortedSubarray(int[] A) {
		int n = A.length, beg = -1, end = -2, min = A[n - 1], max = A[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, A[i]);
			min = Math.min(min, A[n - 1 - i]);
			if (A[i] < max)
				end = i;
			if (A[n - 1 - i] > min)
				beg = n - 1 - i;
		}
		return end - beg + 1;
	}

	public static int findUnsortedSubarray2(int[] nums) {
		int[] clone = nums.clone();
		Arrays.sort(nums);
		int n = nums.length;
		int beg = 0;
		while (beg < n && nums[beg] == clone[beg])
			beg++;
		int end = n - 1;
		while (end > beg && nums[end] == clone[end])
			end--;
		return end - beg + 1;

	}

	public static int findUnsortedSubarray11(int[] A) {
		int beg = 0, end = 0;
		int n = A.length - 1;
		int max = A[0];
		int min = A[n];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max)
				beg = i;
			if (A[i] < min)
				end = n;
		}
		return 0;
	}

}
