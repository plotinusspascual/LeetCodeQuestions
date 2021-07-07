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