package easy.math;

public class MinimumMovestoEqualArrayElements453 {
	public int minMoves(int[] nums) {
		int min = Integer.MAX_VALUE;
		for (int i : nums) {
			min = Math.min(min, i);
		}
		int res = 0;
		for (int i : nums) {
			res += i - min;
		}
		return res;
	}
}
