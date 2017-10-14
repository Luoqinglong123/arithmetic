package easy.array;

public class RotateArray189 {
	public static void main(String[] args) {
		int k = 3;
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int[] rotate = rotate1(nums, k);
		for (int i = 0; i < rotate.length; i++) {
			System.out.print(rotate[i] + "\t");
		}
	}

	public static int[] rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		return nums;
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static int[] rotate1(int[] nums, int k) {
		k = k % nums.length;
		reverse1(nums, 0, nums.length - 1);
		reverse1(nums, 0, k - 1);
		reverse1(nums, k, nums.length - 1);

		return nums;

	}

	public static void reverse1(int[] nums, int start, int end) {
		while (end > start) {
			int temp = 0;
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			end--;
			start++;
		}
	}
}
