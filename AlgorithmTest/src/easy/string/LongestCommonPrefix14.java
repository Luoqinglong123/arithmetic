package easy.string;

public class LongestCommonPrefix14 {
	public static void main(String[] args) {
		String[] strs = { "abcaaaa", "abcasfd", "abcas", "abcqq" };
		String string = longestCommonPrefix1(strs);
		System.out.println(string);
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String pre = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0)
				pre = pre.substring(0, pre.length() - 1);
			i++;
		}
		return pre;
	}

	public static String longestCommonPrefix1(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		String pre = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0)
				pre = pre.substring(0, pre.length() - 1);
			i++;
		}
		return pre;

	}
}
