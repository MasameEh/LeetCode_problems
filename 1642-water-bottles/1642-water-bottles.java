class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles, bottleExchanged = 0;

        while(numBottles >= numExchange)
        {
            bottleExchanged = numBottles / numExchange; // exchanged the empty bottles to get full water bottles.
            total += bottleExchanged; // add to the total bottles we had 
            numBottles = numBottles % numExchange; // see how many bottles left
            numBottles += bottleExchanged; // add bottles we get to the bottles we have
        }
        return total;
    }
}