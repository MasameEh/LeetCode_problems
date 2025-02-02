class Solution {
    public boolean check(int[] nums) {
        int swingCount = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] <= nums[i+1]){
                continue;
            }else swingCount++;
        }

        if (nums[nums.length - 1] > nums[0]) {
            swingCount++;
        }

        return swingCount <= 1;
    }
}