class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums[nums.length - 1] - nums[0];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countPairs(nums, mid);
            
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private int countPairs(int[] nums, int target) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] - nums[i] <= target) {
                j++;
            }
            count += j - i - 1;
        }
        return count;
    }
}
