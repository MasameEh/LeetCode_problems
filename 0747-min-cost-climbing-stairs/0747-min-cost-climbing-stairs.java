class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n < 2) {
            return 0;
        }
    
        int[] dp = new int[n];
        
        // To reach the first or second step, you must pay their respective costs
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        // Start from the third step and calculate the minimum cost to reach that step
        for (int i = 2; i < n; i++) {
            // To reach the ith step, you can either come from (i-1)th or (i-2)th step,
            // so take the minimum of those two and add the cost of the ith step
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        
        // To reach the top of the floor, you can either come from the last step or the second-to-last step,
        // so the answer is the minimum of those two options
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}