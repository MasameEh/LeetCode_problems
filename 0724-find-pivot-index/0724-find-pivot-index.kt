class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val prefixSumArr = Array<Int>(nums.size + 1){0}

        for(i in nums.indices){
            prefixSumArr[i + 1] = nums[i] + prefixSumArr[i]
        }

        for(i in nums.indices){
            val rightSum = prefixSumArr[i]
            val leftSum = prefixSumArr[nums.size] - prefixSumArr[i + 1]

            if(rightSum == leftSum){
                return i
            }
        }

        return -1
    }
}