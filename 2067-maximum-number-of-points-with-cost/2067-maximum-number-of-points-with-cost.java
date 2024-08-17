class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;

        // Initialize the dp array to store maximum points for the current row
        long[] prevRow = new long[n];

        // Initialize the first row
        for (int j = 0; j < n; j++) {
            prevRow[j] = points[0][j];
        }

        // Iterate through the rows
        for (int i = 1; i < m; i++) {
            long[] currRow = new long[n];
            long[] leftMax = new long[n];
            long[] rightMax = new long[n];

            // Calculate leftMax array
            leftMax[0] = prevRow[0];
            for (int j = 1; j < n; j++) {
                leftMax[j] = Math.max(leftMax[j - 1], prevRow[j] + j);
            }

            // Calculate rightMax array
            rightMax[n - 1] = prevRow[n - 1] - (n - 1);
            for (int j = n - 2; j >= 0; j--) {
                rightMax[j] = Math.max(rightMax[j + 1], prevRow[j] - j);
            }

            // Calculate the maximum points for the current row
            for (int j = 0; j < n; j++) {
                currRow[j] = points[i][j] + Math.max(leftMax[j] - j, rightMax[j] + j);
            }

            // Update prevRow for the next iteration
            prevRow = currRow;
        }

        // The answer is the maximum value in the last row
        long maxPoints = 0;
        for (long score : prevRow) {
            maxPoints = Math.max(maxPoints, score);
        }

        return maxPoints;
    }
}
