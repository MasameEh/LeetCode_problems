class Solution {
  int minIncrementForUnique(List<int> nums) 
  {   
    if (nums.isEmpty) return 0;

    // Step 1: Sort the array
    nums.sort();

    int movesNum = 0;

    // Step 2: Iterate through the sorted list and ensure uniqueness
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] <= nums[i - 1]) {
            // Calculate how much we need to increment the current number
            int increment = nums[i - 1] - nums[i] + 1;
            nums[i] += increment;
            movesNum += increment;
        }
    }
    return movesNum;
   }
}