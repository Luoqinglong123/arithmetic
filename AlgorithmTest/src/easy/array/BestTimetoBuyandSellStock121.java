package easy.array;

public class BestTimetoBuyandSellStock121 {

	public static void main(String[] args) {
		int[] prices = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit1(prices));
	}

	public static int maxProfit(int prices[]) {
		int maxprofit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int profit = prices[j] - prices[i];
				if (profit > maxprofit)
					maxprofit = profit;
			}
		}
		return maxprofit;
	}

	public static int maxProfit1(int[] prices) {
		int maxPro = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int nowPro = prices[j] - prices[i];
				if (nowPro > maxPro) {
					maxPro = nowPro;
				}
			}
		}

		return maxPro;

	}

}
