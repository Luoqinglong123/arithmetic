package easy.string;

public class NumberofSegmentsinaString434 {
	public static void main(String[] args) {
		System.out.println(countSegments2("Hello, my name is John"));
	}

	public static int countSegments(String s) {

		return s.trim().split(" ").length;

	}

	public static int countSegments2(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
				res++;
		return res;
	}

	public static int countSegments4(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
				res++;
		}
		return res;
	}
}
