package easy.math;

public class PerfectNumber507 {
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(99999993));
	}

	public static boolean checkPerfectNumber(int num) {
		if (num <= 0)
			return false;
		int res = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				res += i;
			if(res>num)
				return false;
		}
		return res == num;

	}
}
