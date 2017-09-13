package array.easy;

public class PlusOne66 {
	public static void main(String[] args) {
		int[] digits = { 9, 9, 9 };
		int[] plusOne = plusOne1(digits);
		for (int i = 0; i < plusOne.length; i++) {
			System.out.print(plusOne[i] + "\t");
		}
	}

	public static int[] plusOne1(int[] digits) {
		int len = digits.length;
		for (int i = len - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int nums[] = new int[len + 1];
		nums[0] = 1;
		return nums;
	}

	public static int[] plusOne(int[] digits) {

		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				// 2<9
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;

		return newNumber;
	}
}
