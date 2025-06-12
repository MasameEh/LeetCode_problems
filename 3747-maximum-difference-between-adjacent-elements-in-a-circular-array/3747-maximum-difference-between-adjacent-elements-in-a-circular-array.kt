class Solution {
    fun maxAdjacentDistance(nums: IntArray): Int {
        var maximum = Int.MIN_VALUE

        for(i in 0 until nums.size){
            if(i == nums.size - 1){
                maximum = max(maximum, abs(nums[i] - nums[0]))
            }else {
                maximum = max(maximum, abs(nums[i] - nums[i + 1]))
            }
           
        }
        return maximum
    }
}