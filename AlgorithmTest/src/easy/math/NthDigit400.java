package easy.math;

public class NthDigit400 {
	public static void main(String[] args) {
		System.out.println(findNthDigit1(15));
	}

	public static int findNthDigit(int n) {
		int len = 1;
		long count = 9;
		int start = 1;

		while (n > len * count) {
			n -= len * count;
			len += 1;
			count *= 10;
			start *= 10;
		}

		start += (n - 1) / len;
		String s = Integer.toString(start);
		return Character.getNumericValue(s.charAt((n - 1) % len));
	}

	public static int findNthDigit1(int n) {
		int start = 1;
		int count = 9;
		int len = 1;
		while (n > start * count) {
			n -= start * count;
			len += 1;
			count *= 10;
			start *= 10;
		}
		start += (n - 1) / len;
		String s = start + "";
		return Character.getNumericValue(s.charAt((n - 1) % len));

	}
}
