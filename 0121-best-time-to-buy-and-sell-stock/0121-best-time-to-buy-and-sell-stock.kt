class Solution {
    fun maxProfit(prices: IntArray): Int {
        var mini =  prices[0]
        var maxProfit = 0

        for(i in 1 until prices.size ){
            if(prices[i] < mini){
                mini = prices[i]
            }

            var profit = prices[i] - mini

            if(maxProfit < profit) maxProfit = profit
        }

        return maxProfit

    }
}