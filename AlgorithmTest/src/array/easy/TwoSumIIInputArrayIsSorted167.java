package array.easy;

public class TwoSumIIInputArrayIsSorted167 {
	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int[] sum = twoSum1(numbers, 26);
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i] + "\n");
		}

	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] res = { 0, 0 };
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					res[0] = i + 1;
					res[1] = j + 1;
				}
			}
		}
		return res;

	}

	public static int[] twoSum1(int[] numbers, int target) {
		int[] res = new int[2];
		if (numbers == null || numbers.length < 2)
			return res;
		int left = 0, right = numbers.length - 1;
		int v = 0;
		while (left < right) {
			v = numbers[left] + numbers[right];
			if (v == target) {
				res[0] = left+1;
				res[1] = right+1;
				break;
			} else if (v < target) {
				left++;
			} else {
				right--;
			}
		}
		return res;

	}
}
