class Solution {
  int minOperations(List<int> nums, int k) {
    nums.sort();

    for(int i = 0; i < nums.length; i++){
        if(nums[i] >= k){
            return i;
        }
    }
    return 0;
  }
}