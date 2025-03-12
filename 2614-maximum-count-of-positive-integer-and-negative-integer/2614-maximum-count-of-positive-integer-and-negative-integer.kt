class Solution {
    fun maximumCount(nums: IntArray): Int {
        var posCount: Int = 0
        var negCount: Int = 0

        for(i in nums.indices){
            if(nums[i] > 0){
                posCount++
            }else if(nums[i] < 0) negCount++
        }

        return Math.max(posCount, negCount)
    }
}