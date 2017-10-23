package easy.string;

public class RepeatedStringMatch686 {
	public static void main(String[] args) {
		String A = "abcd";
		String B = "cdabcdab";
		System.out.println(repeatedStringMatch(A, B));
	}

	public static int repeatedStringMatch(String A, String B) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while (sb.length() < B.length()) {
			sb.append(A);
			count++;
		}
		if (sb.toString().contains(B))
			return count;
		if (sb.append(A).toString().contains(B))
			return ++count;
		return -1;
	}
}
