package easy.string;

public class ImplementStrStr28 {
	public static void main(String[] args) {
		String needle = "eca";
		String haystack = "cdeaac";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == needle.length())
					return i;
				if (i + j == haystack.length())
					return -1;
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}
	}

	public static int strStr1(String haystack, String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if (j == needle.length())
					return i;
				else if (i + j == haystack.length())
					return -1;
				else if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}


	}
}
