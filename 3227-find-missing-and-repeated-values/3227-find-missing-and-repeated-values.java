class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length;
        int[] count = new int[n + 1]; 
        int[] result = new int[2]; 

        // Count occurrences of each number in the grid
        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }

        // Find the repeated and missing numbers
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i; 
            } else if (count[i] == 0) {
                result[1] = i; 
            }
        }

        return result;
    }
}
