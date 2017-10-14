package easy.array;

/**
 * 
 * @author Administrator Suppose you have a long flowerbed in which some of the
 *         plots are planted and some are not. However, flowers cannot be
 *         planted in adjacent plots - they would compete for water and both
 *         would die.
 * 
 *         Given a flowerbed (represented as an array containing 0 and 1, where
 *         0 means empty and 1 means not empty), and a number n, return if n new
 *         flowers can be planted in it without violating the
 *         no-adjacent-flowers rule.
 * 
 * 
 *         Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 Output: True Example
 *         2: Input: flowerbed = [1,0,0,0,1], n = 2 Output: False
 */

public class CanPlaceFlowers605 {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		for (int i = 0; i < flowerbed.length && count < n; i++) {
			if (flowerbed[i] == 0) {
				// get next and prev flower bed slot values. If i lies at the
				// ends the next and prev are considered as 0.
				int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
				int prev = (i == 0) ? 0 : flowerbed[i - 1];
				if (next == 0 && prev == 0) {
					flowerbed[i] = 1;
					count++;
				}
			}
		}

		return count == n;
	}

	public static void main(String[] args) {
		int[] flowerbed = { 1, 0, 0, 0, 0,0,0, 0, 1 };
		boolean flowers = canPlaceFlowers1(flowerbed, 2);
		System.out.println(flowers);

	}

	private static boolean canPlaceFlowers1(int[] flowerbed, int n) {
		int count = 0;
		for (int i = 0; i < flowerbed.length ; i++) {
			if(flowerbed[i]==0){
				int next = i==flowerbed.length-1?0:flowerbed[i+1];
				int prev= i==0?0:flowerbed[i-1];
				if(next ==0 && prev==0){
					flowerbed[i]=1;
					count++;
				}
			}
		}
		return n<=count;
	}
	public boolean canPlaceFlowers2(int[] flowerbed, int n) {
	    int count = 1;
	    int result = 0;
	    for(int i=0; i<flowerbed.length; i++) {
	        if(flowerbed[i] == 0) {
	            count++;
	        }else {
	            result += (count-1)/2;
	            count = 0;
	        }
	    }
	    if(count != 0) result += count/2;
	    return result>=n;
	}

}
