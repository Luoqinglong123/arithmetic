package easy.math;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger7 {
	public static void main(String[] args) {
		System.out.println(reverse2(123));
	}

	public static int reverse(int x) {
		String strX = x + "";
		List<String> list = new ArrayList<>();
		if (strX.startsWith("-")) {
			for (int i = 1; i < strX.length(); i++) {
				list.add(strX.charAt(i) + "");
			}
		} else {
			for (int i = 0; i < strX.length(); i++) {
				list.add(strX.charAt(i) + "");
			}
		}
		for (int i = 0; i < list.size() / 2; i++) {
			String temp = list.get(i);
			String tail = list.get(list.size() - 1 - i);
			list.set(i, tail);
			list.set(list.size() - 1 - i, temp);
		}
		String res = "";
		for (String string : list) {
			res += string;
		}
		int parseInt = 0;
		try {
			parseInt = Integer.parseInt(res.toString());
			if (strX.startsWith("-"))
				parseInt = -parseInt;
		} catch (Exception ex) {
			return 0;
		}
		return parseInt;

	}

	public static int reverse2(int x) {
		int result = 0;

		while (x != 0) {
			int tail = x % 10;
			int newResult = result * 10 + tail;
			if ((newResult - tail) / 10 != result) {
				return 0;
			}
			result = newResult;
			x = x / 10;
		}

		return result;
	}

	public static int reverse3(int x) {
		int result = 0;
		while (x != 0) {
			int tail = x % 10;
			int newRes = result * 10 + tail;
			if ((newRes - tail) / 10 != result) {
				return 0;
			}
			result = newRes;
			x = x / 10;
		}
		return result;
	}
}
