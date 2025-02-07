class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorFreq = new HashMap<>();
        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];

         
            if (ballToColor.containsKey(ball)) {
                int oldColor = ballToColor.get(ball);
                colorFreq.put(oldColor, colorFreq.get(oldColor) - 1);

                if (colorFreq.get(oldColor) == 0) {
                    colorFreq.remove(oldColor);
                }
            }

            ballToColor.put(ball, newColor);
            colorFreq.put(newColor, colorFreq.getOrDefault(newColor, 0) + 1);

            res[i] = colorFreq.size();
        }

        return res;
    }
}