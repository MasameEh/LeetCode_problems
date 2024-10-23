class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length == 3) return nums[0] * nums[1] * nums[2];

        Arrays.sort(nums);
        int n = nums.length;

        return ((nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]) > 
        (nums[0]*nums[1]*nums[nums.length-1])) ? 
        (nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]) : 
        ( nums[0]*nums[1]*nums[nums.length-1]);
    }
}