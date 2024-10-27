class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            // Update minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit by subtracting min price from current price
            int profit = price - minPrice;
            // Update max profit if current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
