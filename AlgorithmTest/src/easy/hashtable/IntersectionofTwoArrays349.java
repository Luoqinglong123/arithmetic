package easy.hashtable;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays349 {

	public static void main(String[] args) {
		int[] nums2 = { 2, 2, 3, 4 };
		int[] nums1 = { 1, 2, 3, 2, 1 };
		int[] intersection = intersection(nums1, nums2);
		for (int i : intersection) {
			System.out.print(i + "\t");
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet();
		Set<Integer> resSet = new HashSet();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i]))
				resSet.add(nums2[i]);
		}
		int[] res = new int[resSet.size()];
		int n = 0;
		for (int i : resSet) {
			res[n++] = i;
		}
		return res;

	}
}
