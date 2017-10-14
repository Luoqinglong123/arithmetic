package easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome409 {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("cccc"));
	}

	public static int longestPalindrome(String s) {
		int result = 0;
		if (s.length() == 1)
			result = 1;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == null)
				map.put(s.charAt(i), 1);
			else
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}
		int ss = 0;
		for (Map.Entry<Character, Integer> item : map.entrySet()) {
			int i = item.getValue();
			if (i == 1)
				ss++;
			if (i > 1) {
				result += 2 * (i / 2);
			}

		}
		if (ss >= 1 && s.length() != 1)
			result++;
		return result;
	}

	public static int longestPalindrome1(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int result = 0;
		Set<Character> integers = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (integers.contains(s.charAt(i))) {
				result++;
				integers.remove(s.charAt(i));
			} else
				integers.add(s.charAt(i));
		}

		if (!integers.isEmpty())
			return (2 * result + 1);
		return 2 * result;
	}
}
