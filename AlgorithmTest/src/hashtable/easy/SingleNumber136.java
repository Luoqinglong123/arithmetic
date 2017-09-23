package hashtable.easy;

public class SingleNumber136 {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };
		System.out.println(singleNumber1(nums));
	}

	// 错误
	public static int singleNumber(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			boolean flage = false;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					flage = true;
			}
			if (!flage)
				return nums[i];
		}
		return 0;
	}

	// 零亦或任何人数为任何数
	public static int singleNumber1(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}
}
