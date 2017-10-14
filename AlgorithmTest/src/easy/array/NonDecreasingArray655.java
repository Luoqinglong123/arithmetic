package easy.array;

public class NonDecreasingArray655 {

	public static boolean checkPossibility(int[] nums) {
		boolean flag = true;
		int index = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				index = i;
				break;
			}
		}
		nums[index] = nums[index + 1] - 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				flag = false;
				break;
			}
		}

		return flag;
	}
	public static void main(String[] args) {
		int[] nums={4,2,1};
		System.out.println(checkPossibility(nums));
	}
	
}
