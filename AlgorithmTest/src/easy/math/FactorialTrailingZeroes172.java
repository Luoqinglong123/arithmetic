package easy.math;

public class FactorialTrailingZeroes172 {
	public static void main(String[] args) {
		System.out.println(trailingZeroes(50));
	}

	public static int trailingZeroes(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	}

	public static int trailingZeroes1(int n) {
		int r = 0;
		while (n > 0) {
			n /= 5;
			r = n + r;
		}
		return r;
	}
}
