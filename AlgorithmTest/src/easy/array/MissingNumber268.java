package easy.array;

import java.util.Arrays;

public class MissingNumber268 {
	public static void main(String[] args) {
		/*int[] num = { 0, 3, 2,1,5 };
		System.out.println(missingNumber1(num));*/
		int a=6^2;
		System.out.println(a);
	}

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if((nums[i]+1)!=nums[i+1])
				return nums[i]+1;
		}
		return 0;

	}
	
	public static int missingNumber1(int[] nums) {

	    int xor = 0, i = 0;
		for (i = 0; i < nums.length; i++) {
			xor = xor ^ i ^ nums[i];
		}

		return xor ^ i;
	}
}