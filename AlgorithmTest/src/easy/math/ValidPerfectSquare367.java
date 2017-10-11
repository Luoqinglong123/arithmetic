package easy.math;

public class ValidPerfectSquare367 {
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(99));
	}

	public static boolean isPerfectSquare(int num) {
		int i = 1;
		while (num > 0) {
			num -= i;
			i += 2;
		}
		return num == 0;
	}

	public static boolean isPerfectSquare1(int num) {
		int i = 1;
		while (num > 0) {
			num -= i;
			i += 2;
		}
		return num == 0;
	}
}
