package easy.string;

public class ReverseStringII541 {
	public static void main(String[] args) {
		int k = 3;
		String s = "abcdefg";
		System.out.println(reverseStr(s, k));
	}

	public static String reverseStr(String s, int k) {
		char[] arr = s.toCharArray();
		int n = arr.length;
		int i = 0;
		while (i < n) {
			int j = Math.min(i + k - 1, n - 1);
			swap(arr, i, j);
			i += 2 * k;
		}
		return String.valueOf(arr);
	}

	private static void swap(char[] arr, int l, int r) {
		while (l < r) {
			char temp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = temp;
		}
	}

	public static String reverseStr1(String s, int k) {
		char[] arr = s.toCharArray();
		int n = arr.length;
		int i = 0;
		while (i < n) {
			int j = Math.min(i + k - 1, n - 1);
			swap2(arr, i, j);
			i += 2 * k;
		}
		return String.valueOf(arr);
	}

	private static void swap2(char[] arr, int i, int j) {
		while (i < j) {
			char temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}

	}

}
