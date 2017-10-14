package easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicateII219 {
	public static void main(String[] args) {
		int k = 5;
		int[] nums = { 5, 9, 4, 6, 3, 8, 4 };
		System.out.println(containsNearbyDuplicate(nums, k));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && j - i == k) {
					return true;
				}
			}
		}
		return false;

	}
	   public static  int findMaxConsecutiveOnes(int[] nums) {
	        int pro =  0;
	        List<Integer> list = new ArrayList<>();
	        for (int i = 0; i < nums.length; i++) {
	            if(nums[i]==1){
	                list.add(++pro);
	            }
	                else {
	                pro=0;
	            }
	        }
	      Object[] array = list.toArray();
	        Arrays.sort(array);
	            return (int) array[array.length-1];
	    }

	public static boolean containsNearbyDuplicate1(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i > k)
				set.remove(nums[i - k - 1]);
			if (!set.add(nums[i]))
				return true;
		}
		return false;
	}
}
