package easy.math;

public class ExcelSheetColumnTitle168 {
	public static void main(String[] args) {
		System.out.println(convertToTitle(27));
	}

	public static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n--;
			sb.insert(0,(char) ('A' + (n % 26)));
			n /= 26;
		}

		return sb.toString();

	}
}
