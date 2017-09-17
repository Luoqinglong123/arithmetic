package array.easy;

public class BestTimetoBuyandSellStockII122 {
public static void main(String[] args) {
	int[] prices={1,7,8,4,3,6};
	System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
	    int total = 0;
	    for (int i = 0; i < prices.length-1; i++) {
			if(prices[i+1]>prices[i]){
				total+=prices[i+1]-prices[i];
			}
		}
	    return total;
	}
}
