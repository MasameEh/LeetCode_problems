class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int len = 1, maxLen = 1;
        boolean isInc = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                if(!isInc){
                    isInc = true;
                    len = 1;
                }
                len++;
            }else if(nums[i] > nums[i + 1]){
                if(isInc){
                    isInc = false;
                    len = 1;
                }
                len++;
            }else len = 1;
            
            System.out.println(len);
            if(maxLen < len){
                maxLen = len;
            }
        }
        return maxLen;
    }
}