class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Long> trackMap = new HashMap<>();
        long totalPairs = (long)n * (n-1) / 2;
        long  goodPairs = 0L;

        for(int i = 0; i < n; i++){
            long freq = trackMap.getOrDefault(nums[i] - i, 0L);
            goodPairs+=freq;
            trackMap.put(nums[i] - i, (long)freq + 1);
        }

       return totalPairs - goodPairs;
    }
}