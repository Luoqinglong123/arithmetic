package easy.string;

public class DetectCapital520 {
	public static void main(String[] args) {
		String word = "G";
		System.out.println(detectCapitalUse(word));
	}

	public static boolean detectCapitalUse(String word) {
		if (word.length() == 1)
			return true;
		if (word == null || word.length() < 1)
			return false;
		int first = word.charAt(0) - 'a';
		if (first >= 0) {
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) - 'a' < 0)
					return false;
			}
		} else {
			int second = word.charAt(1) - 'a';
			if (second >= 0) {
				for (int i = 2; i < word.length(); i++) {
					if (word.charAt(i) - 'a' < 0)
						return false;
				}
			} else {
				for (int i = 2; i < word.length(); i++) {
					if (word.charAt(i) - 'a' >= 0)
						return false;
				}
			}
		}
		return true;
	}

	public static boolean detectCapitalUse1(String word) {
		int i = 0 ; 
		for (int j = 0; j < word.length(); j++) {
			if('Z'-word.charAt(j)>=0)
				i++;
		}
		return i==0||i==word.length()||'Z'-word.charAt(0)>=0&&i==1;
	}
}
