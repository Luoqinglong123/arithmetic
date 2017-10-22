package easy.string;

public class JudgeRouteCircle657 {
	public boolean judgeCircle(String moves) {
		int i = 0, j = 0;
		for (char c : moves.toCharArray()) {
			if (c == 'U')
				i++;
			else if (c == 'D')
				i--;
			else if (c == 'L')
				j++;
			else
				j--;
		}
		return i == 0 && j == 0;

	}
}
