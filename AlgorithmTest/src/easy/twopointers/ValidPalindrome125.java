package easy.twopointers;

public class ValidPalindrome125 {
	public boolean isPalindrome1(String s) {
		if (s.isEmpty()) {
			return true;
		}
		int head = 0, tail = s.length() - 1;
		char cHead, cTail;
		while (head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				if (Character.toLowerCase(cHead) != Character
						.toLowerCase(cTail)) {
					return false;
				}
				head++;
				tail--;
			}
		}

		return true;
	}

	public boolean isPalindrome2(String s) {
		if (s.isEmpty())
			return true;
		int end = s.length() - 1;
		int start = 0;
		char sChar, eChar;
		while (end >= start) {
			sChar = s.charAt(start);
			eChar = s.charAt(end);
			if (!Character.isLetterOrDigit(sChar)) {
				start++;
			} else if (!Character.isLetterOrDigit(eChar)) {
				end--;
			} else {
				if (Character.toLowerCase(sChar) != Character
						.toLowerCase(eChar)) {
					return false;
				}
				start++;
				end--;
			}
		}
		return true;

	}
}
