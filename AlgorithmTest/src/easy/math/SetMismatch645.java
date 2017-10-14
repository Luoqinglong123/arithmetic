package easy.math;

public class SetMismatch645 {
	public static void main(String[] args) {
		int[] nums = { 1,1};
		int[] is = findErrorNums(nums);
		for (int i : is) {
			System.out.print(i + "\t");
		}

	}

	public static int[] findErrorNums(int[] nums) {
		int[] res = new int[2];
		for (int i : nums) {
			if (nums[Math.abs(i) - 1] < 0)
				res[0] = Math.abs(i);
			else
				nums[Math.abs(i) - 1] *= -1;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				res[1] = i + 1;
		}
		return res;
	}

	public static int[] findErrorNums1(int[] nums) {
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			while (nums[i] - 1 != i && nums[nums[i] - 1] != nums[i]) {
				swap(nums, i, nums[i] - 1);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] - 1 != i) {
				result[0] = nums[i];
				result[1] = i + 1;
				break;
			}
		}

		return result;
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
