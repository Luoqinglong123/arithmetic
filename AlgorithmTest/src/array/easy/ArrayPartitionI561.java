package array.easy;

import java.util.Arrays;

/**
 * test1
 * @author Administrator Input: [1,4,3,2]
 * 
 *         Output: 4 Explanation: n is 2, and the maximum sum of pairs is 4 =
 *         min(1, 2) + min(3, 4).
 */
public class ArrayPartitionI561 {
	public static void main(String[] args) {
		int[] nums = { 1, 16, 9, 2 };
		int sum = arrayPairSum(nums);
		System.err.println(sum);
	}

	private static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		//1 2 9 16
		int result = 0 ;
		for (int i = 0; i < nums.length; i+=2) {
			result+=nums[i];
		}
		return result;
	}
}
