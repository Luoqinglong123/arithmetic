package easy.string;

public class RepeatedSubstringPattern459 {
	
	public static void main(String[] args) {
		boolean repeatedSubstringPattern = repeatedSubstringPattern("abcabcabcabc");
	}
	public  static boolean repeatedSubstringPattern(String s) {
		int l = s.length();
		for (int i = l / 2; i >= 1; i--) {
			if (l % i == 0) {
				int m = l / i;
				String substring = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < m; j++) {
					sb.append(substring);
				}
				
				if(sb.toString().equals(s)) return true;
			}
		}
		return false;
	}
}
