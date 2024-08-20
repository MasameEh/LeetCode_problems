class Solution {
    int maxStonesAliceCanGet(List<int> suffixSums, int m, int currentPile, List<List<int>> memo){
        int totalPiles = suffixSums.length - 1;
        
        if (currentPile >= totalPiles) return 0;
        
        if (currentPile + 2 * m >= totalPiles) {
            return suffixSums[currentPile];
        }
        
        if (memo[currentPile][m] != 0) return memo[currentPile][m];
        
        int maxStones = 0;
        
        for (int x = 1; x <= 2 * m; x++) {
            int currentStones = 
                suffixSums[currentPile] - 
                    maxStonesAliceCanGet(suffixSums, max(m,x), currentPile + x, memo);
            maxStones = max(maxStones, currentStones);
        }
        
        memo[currentPile][m] = maxStones;
        return maxStones;
    }

  int stoneGameII(List<int> piles) {
    int totalPiles = piles.length;
    List<int> suffixSums = List.filled(totalPiles + 1, 0);

    for (int i = totalPiles - 1; i >= 0; i--) {
        suffixSums[i] = suffixSums[i + 1] + piles[i];
    }

    return maxStonesAliceCanGet(suffixSums, 1, 0, List.generate(totalPiles, (_) => List.filled       (totalPiles + 1, 0)));

   }
    
}