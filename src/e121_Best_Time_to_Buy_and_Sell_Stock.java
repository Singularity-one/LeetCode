/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

*/
public class e121_Best_Time_to_Buy_and_Sell_Stock {
	 public int maxProfit(int[] prices) {
	        if(prices == null || prices.length == 0) return 0;
	        int min = prices[0];
	        int max = Integer.MIN_VALUE;
	        
	        for(int i = 0; i < prices.length; i++){
	            int money = prices[i] - min;
	            if(money > max) max = money;
	            if(prices[i] < min) min = prices[i];
	        }
	        
	        return max;
	    }
}
