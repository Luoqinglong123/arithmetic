package easy.hashtable;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
	public static void main(String[] args) {
		System.out.println(isHappy2(11));
	}

	public static boolean isHappy(int n) {
		int result = 0;
		String ns = n + "";
		int[] array = new int[ns.length()];
		for (int i = 0; i < ns.length(); i++) {
			array[i] = Integer.parseInt(ns.charAt(i) + "")
					* Integer.parseInt(ns.charAt(i) + "");
		}
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		isHappy(result);
		if (result == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isHappy1(int n) {
		Set<Integer> inLoop = new HashSet<Integer>();
		int squareSum, remain;
		while (inLoop.add(n)) {
			squareSum = 0;
			while (n > 0) {
				remain = n % 10;
				squareSum += remain * remain;
				n /= 10;
			}
			if (squareSum == 1)
				return true;
			else
				n = squareSum;
		}
		return false;
	}

	public static boolean isHappy2(int n) {
		Set<Integer> set = new HashSet<Integer>();
		int sum, reamin;
		while (set.add(n)) {
			sum = 0;
			while (n > 0) {
				reamin = n % 10;
				sum += reamin * reamin;
				n /= 10;
			}
			if (sum == 1)
				return true;
			else
				n = sum;
		}
		return false;
	}
}
