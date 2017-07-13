package array.easy;

/**
 * 
 * @author Administrator Given a sorted array, remove the duplicates in place
 *         such that each element appear only once and return the new length.
 * 
 *         Do not allocate extra space for another array, you must do this in
 *         place with constant memory.
 * 
 *         For example, Given input array nums = [1,1,2],
 * 
 *         Your function should return length = 2, with the first two elements
 *         of nums being 1 and 2 respectively. It doesn't matter what you leave
 *         beyond the new length.
 *         给定排序的数组中，移除所述重复的每一个元素都只出现一次并返回新的长度。不分配额外的空间用于另�?��数组，你必须这样做，在恒定的存储器�?例如�?
 *         给定阵列输入比丘�?&bra;2&ket;，您函数应该返回长度�?，与第一元件的两个数值分别为1�?。这没有关系你离�?��后的新长度�?
 */
public class RemoveDuplicatesfromSortedArray26 {
	private static final int[] A = {};

	public static void main(String[] args) {
		int removeDuplicates = removeDuplicates(A);
		System.out.println(removeDuplicates);
	}

	public static int removeDuplicates(int[] A) {
		try {
			if (A.length == 0||A==null)
				throw new Exception("输入数据错误");
		} catch (Exception e) {
			e.printStackTrace();
		}
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != A[j])
				A[++j] = A[i];
		}

		return ++j;

	}
}
