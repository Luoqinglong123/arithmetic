package easy.hashtable;

public class FindtheDifference389 {
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {
		int res = 0, tres = 0;
		for (int i = 0; i < s.length(); i++) {
			res += (int)s.charAt(i);
		}
		for (int i = 0; i < t.length(); i++) {
			tres += (int)t.charAt(i);
		}

		return (char)(tres-res);

	}
}