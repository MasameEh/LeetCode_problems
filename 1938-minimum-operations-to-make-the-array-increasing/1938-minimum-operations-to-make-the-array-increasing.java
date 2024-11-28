class Solution {
    public int minOperations(int[] nums) {
        int counter = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] >  nums[i]){
                continue;
            }else{
                int diff = nums[i] - nums[i+1];
                counter+=(diff+1);
                nums[i+1] += diff+1;
            }
        }
        return counter;
    }
}