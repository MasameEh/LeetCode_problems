class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minW = Integer.MAX_VALUE;

        for (int i = 0; i <= blocks.length() - k; i++) {
            int wCount = 0;

            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    wCount++;
                }
            }
            System.out.println(wCount);
            if (wCount < minW) {
                minW = wCount;
            }
        }
        return minW;
    }
}