class Solution {
    fun returnToBoundaryCount(nums: IntArray): Int {
        var count = 0
        var sum = 0
        for(i in nums.indices){
            sum += nums[i]
            if(sum == 0){
                count++
            }
        }
        return count
    }
}