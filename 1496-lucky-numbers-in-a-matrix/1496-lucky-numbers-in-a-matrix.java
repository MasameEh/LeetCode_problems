class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Map<Integer, Integer> minElements = new HashMap<>();
        List<Integer> luckyNumbers = new ArrayList<>();

        // Find the minimum element in each row and store it with its column index
        for (int i = 0; i < matrix.length; i++) {
            int minNum = matrix[i][0];
            int minIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minNum) {
                    minNum = matrix[i][j];
                    minIndex = j;
                }
            }
            minElements.put(minNum, minIndex);
        }

        // Check if the min element in the row is the max in its column
        for (Map.Entry<Integer, Integer> entry : minElements.entrySet()) {
            int key = entry.getKey();
            int columnIndex = entry.getValue();
            boolean isLucky = true;

            for (int i = 0; i < matrix.length; i++) {
                if (key < matrix[i][columnIndex]) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                luckyNumbers.add(key);
            }
        }

        return luckyNumbers;
    }
}