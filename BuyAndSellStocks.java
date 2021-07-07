/* 121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the 
price of a given stock on the ith day.

You want to maximize your profit by choosing a single 
day to buy one stock and choosing a different day in the 
future to sell that stock.

Return the maximum profit you can achieve from this 
transaction. If you cannot achieve any profit, return 0.
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell 
on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not 
allowed because you must buy before you sell.
*/

public class BuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int maxPay = 0;
        int diffPay;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                diffPay = prices[j] - prices[i];
                if (diffPay > maxPay) {
                    maxPay = diffPay;
                }
            }
        }
        return maxPay;
    }

    public static void main(String[] args) {
        BuyAndSellStocks test = new BuyAndSellStocks();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int output = test.maxProfit(prices);
        System.out.println("Output: " + output);
    }
}