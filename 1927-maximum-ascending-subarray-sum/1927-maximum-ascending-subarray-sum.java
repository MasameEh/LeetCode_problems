class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int sum = 0, maxSum = 0;
        boolean isInc = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                if(!isInc){
                    isInc = true;
                    sum = 0;
                }
                if(i == nums.length - 2){
                    sum+=(nums[i] + nums[i+1]);
                }else{
                    sum+=nums[i];
                }
                
            }else if(nums[i] >= nums[i + 1]){
                if(isInc){
                    isInc = false;
                    sum += nums[i];
                }
            }

            if(maxSum < sum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}