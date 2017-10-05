package easy.math;

public class PalindromeNumber9 {
	public static void main(String[] args) {
		System.out.println(isPalindrome1(11211));
	}

	public static boolean isPalindrome(int x) {

		if (x < 0)
			return false;

		int p = x;
		int q = 0;

		while (p >= 10) {
			q *= 10;
			q += p % 10;
			p /= 10;
		}

		return q == x / 10 && p == x % 10;
	}

	public static boolean isPalindrome1(int x) {
		if (x < 0)
			return false;
		int p = x, q = 0;
		while (p / 10 > 0) {
			q = 10 * q + p % 10;
			p = p / 10;
		}
		return q == x / 10 && p == x % 10;

	}
}
