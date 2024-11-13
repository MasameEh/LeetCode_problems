class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length - 1; i++){
            int number = nums[i];
            for(int j = i + 1; j <= i + k && j < nums.length; j++){
                if(number == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}