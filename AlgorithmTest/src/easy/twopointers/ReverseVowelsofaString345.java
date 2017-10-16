package easy.twopointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsofaString345 {
	public String reverseVowels(String s) {
		Set<Character> set = new HashSet<>(
				Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' }));

		char[] cs = s.toCharArray();
		for (int i = 0, j = cs.length - 1; i < j;) {
			if (!set.contains(cs[i])) {
				i++;
				continue;
			}
			if (!set.contains(cs[j]))

			{
				j--;
				continue;
			}
			char temp = cs[i];
			cs[i] = cs[j];
			cs[j] = temp;
			i++;
			j--;
		}

		return String.valueOf(cs);

	}
}
