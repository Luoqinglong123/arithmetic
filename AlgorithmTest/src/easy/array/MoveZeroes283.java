package easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0].
 * 
 * @author Administrator
 *
 */
public class MoveZeroes283 {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 20, 12, 19 };
		// moveZeroes(nums);
		System.out.println();
		// moveZeroes1(nums);
		moveZeroes2(nums);
	}

	private static void moveZeroes2(int[] nums) {
		if (nums.length == 0 || nums == null)
			return;
		int index = 0;
		for (int i : nums) {
			if (i != 0) {
				nums[index++] = i;
			}
		}
		while (index < nums.length) {
			nums[index++] = 0;
		}
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	private static void moveZeroes1(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}

		for (

		int i : nums) {
			System.out.print(i + " ");
		}
	}

	public static void moveZeroes(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		for (Integer integer : nums) {
			list.add(integer);
		}
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				list2.add(list.get(i));
				list.remove(i);
				--i;
			}
		}

		for (Integer integer : list2) {
			list.add(integer);
		}

		for (Integer integer : list) {
			System.out.print(integer + " ");
		}

	}
}
