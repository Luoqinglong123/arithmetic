package easy.array;

public class MergeSortedArray88 {
	public static void main(String[] args) {
		int n=4 ;
		int[] nums1={1,2,3,5,6,8,0,0,0,0};
		int[] nums2 = {4,5,8,9};
		int m = 6;
		int[] merge = merge(nums1, m, nums2 , n );
		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i]+"\t");
		}
	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;
		while (i > -1 && j > -1) {
			nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
		}
		while(j>-1){
			nums1[k--]=nums2[j--];
		}
		
		return nums1;
	}
}
