class Solution {
  int findMaxConsecutiveOnes(List<int> nums) {
    int maxOnes = 0, ones = 0;

    for(int i = 0; i < nums.length; i++){
        if(nums[i] == 1){
            ones++;
        }else{
            ones = 0;
        }
        if(ones > maxOnes){
            maxOnes = ones;
        }
    }
    return maxOnes;
  }
}