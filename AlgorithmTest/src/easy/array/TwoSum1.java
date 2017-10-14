package easy.array;

/*
 * 
 * Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum1 {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 11, 15 };
		int[] twoSum = twoSum(nums, 5);
		for (int i = 0; i < twoSum.length; i++) {

			System.out.println(twoSum[i]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
					if (nums[i] + nums[j] == target) {
						a[0] = i;
						a[1] = j;
						return a;
				}
			}
		}
		System.out.println("错误输入");
		return a;
	}
}