class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingleDigs = 0;  
        int sumDoubleDigs = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 9){
                sumSingleDigs += nums[i];
            }else sumDoubleDigs += nums[i];
        }

        return sumSingleDigs != sumDoubleDigs;
    }
}