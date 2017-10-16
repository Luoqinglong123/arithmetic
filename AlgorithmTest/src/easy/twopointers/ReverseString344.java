package easy.twopointers;

public class ReverseString344 {
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}

	public static String reverseString(String s) {
		char[] charArray = s.toCharArray();
		int start = 0, end = charArray.length - 1;
		while (end > start) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			end--;
			start++;
		}
		return new String(charArray);
	}
}
