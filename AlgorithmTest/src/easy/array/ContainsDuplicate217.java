package easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * 
 * 
 * @author Administrator
 *
 */
public class ContainsDuplicate217 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3, 4 };
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (Integer integer : nums) {
			boolean add = set.add(integer);
			if (!add) {
				return true;
			}
		}
		return false;

	}
}
