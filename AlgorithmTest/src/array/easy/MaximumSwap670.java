package array.easy;


public class MaximumSwap670 {
	public static void main(String[] args) {
		System.out.println(maximumSwap(99736));
	}

	public static int maximumSwap(int num) {
		char[] digits = Integer.toString(num).toCharArray();
		int[] buckets = new int[10];
		for (int i = 0; i < digits.length; i++) {
			buckets[digits[i] - '0'] = i;
		}
		//当它走到第三位的时候，发现先出现了  4  ，那么第四位的数字在第三位后面，也就是说第四位的数字比第三位数字大，所以它俩需要交换。
		for (int i = 0; i < digits.length; i++) {
			//值大于当前下标对应的char值 
			for (int k = 9; k > digits[i] - '0'; k--) {
				//对应k值的下标大于当前i的下标，说明此值比当前下标对应的值大，所以需要交换
				if (buckets[k] > i) {
					char tmp = digits[i];
				 	digits[i] = digits[buckets[k]];
					digits[buckets[k]] = tmp;
					return Integer.valueOf(new String(digits));
				}
			}
		}

		return num;
	}

	public static int maximumSwap1(int num) {
		char[] digits = Integer.toString(num).toCharArray();
		int[] buckets = new int[10];
		for (int i = 0; i < digits.length; i++) {
			buckets[digits[i] - '0'] = i;
		}
		for (int i = 0; i < digits.length; i++) {
			for (int k = 9; k > digits[i] - '0'; k--) {
				if (buckets[k] > i) {//??
					char temp = digits[i];
					digits[i]=digits[buckets[k]];
					digits[buckets[k]] = temp;
					return Integer.valueOf(new String(digits));
				}
			}
		}
		return num;
	}
}
