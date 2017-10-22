package easy.string;

public class ReverseWordsinaStringIII557 {
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

	public static String reverseWords(String s) {
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++)
			str[i] = new StringBuilder(str[i]).reverse().toString();
		StringBuilder result = new StringBuilder();
		for (String st : str)
			result.append(st + " ");
		return result.toString().trim();
	}
}
