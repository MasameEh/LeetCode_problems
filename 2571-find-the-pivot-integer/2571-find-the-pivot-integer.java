class Solution {
    public int pivotInteger(int n) {
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0; 

        // Compute prefix sums
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + i;
        }

        // Total sum of numbers from 1 to n
        int totalSum = prefixSum[n];

        // Look for the pivot index
        for (int i = 1; i <= n; i++) {
            if (prefixSum[i] == (totalSum + i) / 2 && (totalSum + i) % 2 == 0) {
                return i;
            }
        }

        return -1; // No pivot found
    }
}
