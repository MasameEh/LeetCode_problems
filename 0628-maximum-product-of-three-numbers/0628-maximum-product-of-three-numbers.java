class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length == 3) return nums[0] * nums[1] * nums[2];

        Arrays.sort(nums);
        int n = nums.length;

        return Math.max(nums[0]* nums[1] * nums[n-1], nums[n-2] * nums[n-3] * nums[n-1]);
    }
}