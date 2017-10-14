package easy.array;

public class LongestContinuousIncreasingSubsequence674 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 6, 4, 7,1,2,3,4,5,6 };
		int ofLCIS = findLengthOfLCIS(a);
		System.out.println(ofLCIS);
	}

	private static int findLengthOfLCIS(int[] a) {

		int rs = 0, len = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == 0 || a[i] <= a[i - 1]) {
				len = 0;
			}
			rs = Math.max(rs, ++len);
		}
		return rs;
	}

	public static int findLengthOfLCIS1(int[] a) {
		int mx = 0;
		for (int i = 0, j = 0; j < a.length; i = (j == 0 || a[j] <= a[j - 1]) ? j
				: i, mx = Math.max(mx, j - i + 1), j++) {
			
		}
		return mx;
	}
}
