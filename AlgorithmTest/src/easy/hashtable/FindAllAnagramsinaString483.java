package easy.hashtable;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString483 {
	public static void main(String[] args) {
		String p = "abc";
		String s = "cbaebabacd";
		for (int i : findAnagrams1(s, p)) {
			System.out.print(i + "\t");
		}
	}

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
		if (s == null || s.length() == 0 || p == null || p.length() == 0)
			return list;
		int[] hash = new int[256]; // character hash
		for (char c : p.toCharArray()) {
			hash[c]++;
		}
		int left = 0, right = 0, count = p.length();
		while (right < s.length()) {
			if (hash[s.charAt(right++)]-- >= 1)
				count--;
			if (count == 0)
				list.add(left);
			if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0)
				count++;
		}
		return list;
	}

	public static List<Integer> findAnagrams1(String s, String p) {
		int[] chars = new int[26];
		List<Integer> result = new ArrayList<>();

		if (s == null || p == null || s.length() < p.length())
			return result;
		for (char c : p.toCharArray())
			chars[c - 'a']++;

		int start = 0, end = 0, count = p.length();
		// Go over the string
		while (end < s.length()) {
			// If the char at start appeared in p, we increase count
			if (end - start == p.length()
					&& chars[s.charAt(start++) - 'a']++ >= 0)
				count++;
			// If the char at end appeared in p (since it's not -1 after
			// decreasing), we decrease count
			if (--chars[s.charAt(end++) - 'a'] >= 0)
				count--;
			if (count == 0)
				result.add(start);
		}

		return result;
	}
}
