package easy.math;

public class UglyNumber263 {
	public static void main(String[] args) {
		System.out.println(isUgly(14));
	}

	public static boolean isUgly(int num) {
		for (int i = 2; i < 6 && num > 0; i++) {
			while (num % i == 0)
				num /= i;
		}
		return num == 1;
	}
}
